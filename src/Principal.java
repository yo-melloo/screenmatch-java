import br.com.mello.screematch.calculo.CalculadoraDeTempo;
import br.com.mello.screematch.calculo.FiltroRecomendacao;
import br.com.mello.screenmatch.modelos.Episodio;
import br.com.mello.screenmatch.modelos.Filme;
import br.com.mello.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        Episodio episodio = new Episodio();


        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1977);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        minhaSerie.setNome("Stranger Things");
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

        meuFilme.exibeFichaTecnica();
        filtro.filtrar(meuFilme);

        System.out.printf(">>> Tempo para maratonar %s: %s minutos.%n", minhaSerie.getNome(), minhaSerie.getDuracaoEmMinutos());

        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());
        filtro.filtrar(episodio);

    }
}
