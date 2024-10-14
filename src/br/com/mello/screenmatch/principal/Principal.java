package br.com.mello.screenmatch.principal;

import br.com.mello.screematch.calculo.CalculadoraDeTempo;
import br.com.mello.screematch.calculo.FiltroRecomendacao;
import br.com.mello.screenmatch.modelos.Episodio;
import br.com.mello.screenmatch.modelos.Filme;
import br.com.mello.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        Episodio episodio = new Episodio();

        Filme meuFilme = new Filme("Star Wars", 1998);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        Filme seuFilme = new Filme("Deadpool 2", 2021);
        seuFilme.setDuracaoEmMinutos(195);
        seuFilme.setIncluidoNoPlano(true);

        Filme nossoFilme = new Filme("Vingadores 2", 2023);
        nossoFilme.setDuracaoEmMinutos(200);
        nossoFilme.setIncluidoNoPlano(true);

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(seuFilme);
        listaDeFilmes.add(nossoFilme);

        Serie minhaSerie = new Serie("Stranger Things", 2017);

        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setAtiva(true);
        episodio.setSerie(minhaSerie);
        episodio.setNome("Episodio 1");
        episodio.setTotalVisualizacoes(111);


        meuFilme.avalia(8);
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(3);
        meuFilme.avalia(1);

        nossoFilme.avalia(7);
        nossoFilme.avalia(2);
        nossoFilme.avalia(4);
        nossoFilme.avalia(2);
        nossoFilme.avalia(0);

        seuFilme.avalia(4);
        seuFilme.avalia(1);
        seuFilme.avalia(2);
        seuFilme.avalia(1);
        seuFilme.avalia(0);


//        seuFilme.exibeFichaTecnica();
//        filtro.filtrar(seuFilme);

//        System.out.printf(">>> Tempo para maratonar %s: %s minutos.%n", minhaSerie.getNome(), minhaSerie.getDuracaoEmMinutos());

//        calculadora.inclui(seuFilme);
//        calculadora.inclui(minhaSerie);
//        System.out.println(calculadora.getTempoTotal());
//        filtro.filtrar(episodio);

        System.out.println(listaDeFilmes);

    }
}
