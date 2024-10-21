package br.com.mello.screenmatch.principal;

import br.com.mello.screenmatch.modelos.Titulo;
import br.com.mello.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        System.out.print("Digite o nome do filme qual deseja pesquisar: ");
        String filme = entrada.nextLine();
        String API_KEY = "1a6bcfd8";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("http://www.omdbapi.com/?apikey=%s&t=%s", API_KEY, filme)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonResponse = response.body();
        //System.out.println(jsonResponse);

        TituloOmdb tituloResultado = gson.fromJson(jsonResponse, TituloOmdb.class);
        Titulo tituloResultadoFinal = new Titulo(tituloResultado);
        System.out.println(tituloResultadoFinal);
    }

}
