import br.com.mello.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        meuFilme.avalia(3);

        meuFilme.exibeFichaTecnica();


    }
}
