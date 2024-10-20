package br.com.mello.screenmatch.principal;

import br.com.mello.screenmatch.modelos.Filme;
import br.com.mello.screenmatch.modelos.Serie;
import br.com.mello.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class  PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("Matrix", 2002);
        favorito.avalia(9.5);

        Filme outro = new Filme("Tranças do Careca", 1998);
        outro.avalia(5);

        Serie serie = new Serie("La casa do Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<Titulo>();

        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

//        for (Titulo item: lista) { // para cada ITEM (tipo TITULO) na LISTA:
//            System.out.println("Nome: " + item.getNome()); // printar nome
//
//            if (item instanceof Filme filme && filme.getClassificacao() > 2) { // se item for uma instância de FILME como filme, e tiver classificação maior que 2:
//                System.out.println("Classificação: " + filme.getClassificacao()); // printar classificação
//            }
//
//        }

        // printar nome do Titulo, e classificação se for um filme com nota maior que 2

        System.out.println(lista);

        System.out.println("Organizando alfabeticamente...");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Organizando cronológicamente...");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
