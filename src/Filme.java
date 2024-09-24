public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //"Void siginifica que este métodoi não possui algum retorno"
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Duração: " + duracaoEmMinutos + "min.");
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.printf("Avaliação: %.2f * (%s avaliações) %n", (somaDasAvaliacoes / totalDeAvaliacoes), totalDeAvaliacoes);

    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
