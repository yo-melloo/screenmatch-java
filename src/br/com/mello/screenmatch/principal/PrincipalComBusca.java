package br.com.mello.screenmatch.principal;

import br.com.mello.screenmatch.excecoes.ExcecaoDeConversaoDeAno;
import br.com.mello.screenmatch.modelos.Filme;
import br.com.mello.screenmatch.modelos.Titulo;
import br.com.mello.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpServer;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        List<Titulo> historicoPesquisa = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String filme = "";
        while (!filme.equals("sair")) {
            System.out.print("Digite o nome do filme qual deseja pesquisar: ");
            filme = entrada.nextLine().replace(" ", "%20");

            if (filme.equals("sair")) {
                break;
            }

            //System.out.println("String pesquisa: " + filme);
            String API_KEY = "1a6bcfd8"; // ainda não sei usar .env em Java XDDDD


            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(String.format("http://www.omdbapi.com/?apikey=%s&t=%s", API_KEY, filme)))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String jsonResponse = response.body();
                //System.out.println("Resposta da API: " + jsonResponse);

                TituloOmdb tituloResultado = gson.fromJson(jsonResponse, TituloOmdb.class);
                Titulo tituloResultadoFinal = new Titulo(tituloResultado);
                System.out.println(tituloResultadoFinal);
                historicoPesquisa.add(tituloResultadoFinal);

            } catch (NumberFormatException e) {
                System.out.println("Ocorreu um erro.");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Ocorreu um erro.\n Há um problema no endereço de pesquisa, verifique o nome do filme digitado.");
                System.out.println(e.getMessage());
            } catch (ExcecaoDeConversaoDeAno e) {
                System.out.println(e.getMessage());
            }
        }

        if (!historicoPesquisa.isEmpty()) {
            System.out.println("Pesquisados: " + historicoPesquisa);

            FileWriter escrita = new FileWriter("filmes.json");
            escrita.write(gson.toJson(historicoPesquisa));
            escrita.close();
        }

        System.out.println("Encerrando programa...");
    }

}
