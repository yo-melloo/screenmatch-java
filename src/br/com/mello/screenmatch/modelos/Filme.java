package br.com.mello.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }


    //"Void siginifica que este métodoi não possui algum retorno"
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Duração: " + duracaoEmMinutos + "min.");
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.printf("Avaliação: %.2f * (%s avaliações) %n", (somaDasAvaliacoes / totalDeAvaliacoes), totalDeAvaliacoes);

    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}