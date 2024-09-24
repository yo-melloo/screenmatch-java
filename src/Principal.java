public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Star Wars";
        meuFilme.anoDeLancamento = 1980;
        meuFilme.duracaoEmMinutos = 180;
        //meuFilme.avaliacao = 8.9;
        //meuFilme.totalDeAvaliacoes = 1200;
        meuFilme.incluidoNoPlano = true;

        // Total de Avaliações: 5 - Nota Final: 27 (confere)
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        meuFilme.avalia(3);

        meuFilme.exibeFichaTecnica();

        //System.out.println(meuFilme.pegaMedia());

    }
}
