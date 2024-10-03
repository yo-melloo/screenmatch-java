import br.com.mello.screematch.calculo.CalculadoraDeTempo;
import br.com.mello.screenmatch.modelos.Filme;
import br.com.mello.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();


        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        minhaSerie.setNome("Bababwey: Penteados de Carecas");
        minhaSerie.setTemporadas(2);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorEpisodio(25);
        minhaSerie.setAtiva(false);


        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        meuFilme.avalia(3);

        meuFilme.exibeFichaTecnica();

        System.out.printf(">>> Tempo para maratonar %s: %s minutos.%n", minhaSerie.getNome(), minhaSerie.getDuracaoEmMinutos());

        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

    }
}
