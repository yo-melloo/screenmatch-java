package br.com.mello.screenmatch.modelos;

import br.com.mello.screenmatch.excecoes.ExcecaoDeConversaoDeAno;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo (TituloOmdb tituloOmdb){
        this.nome = tituloOmdb.title();
        if (tituloOmdb.year().length() > 4){
            throw new ExcecaoDeConversaoDeAno("Não foi possível converter o ano de lançamento para este filme");
        }
        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 3));

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    //"Void siginifica que este métodoi não possui algum retorno"
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Duração: " + duracaoEmMinutos + "min.");
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.printf("Avaliação: %s Estrelas (%s avaliações) %n", (int) pegaMedia(), totalDeAvaliacoes);

    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return this.getNome() + " (" + this.getAnoDeLancamento() +") - " + this.getDuracaoEmMinutos() + " min.";
    }
}
