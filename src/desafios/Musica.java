package desafios;

public class Musica {
    String titulo;
    String artista;
    String album;
    int anoLancamento;
    double avaliacao;
    double mediaDeAvaliacoes;
    int numAvaliacoes;

    // exibir a ficha técnica
    void exibirFichaTecnica(){
        String fichaTecnica = String.format("""
                Título: "%s"
                Artista: %s
                Álbum: %s
                Ano de Lançamento: %s
                Avaliação: %.1f (%s avaliações)
                """,titulo,artista,album,anoLancamento,mediaDeAvaliacoes, numAvaliacoes);

        System.out.println(fichaTecnica);
    }

    // avaliar a música
    void avaliarEm(double nota){
        avaliacao += nota;
        numAvaliacoes ++;
        mediaDeAvaliacoes = avaliacao / numAvaliacoes;
    }

    // calcular a média de avaliações
    void mediaDasAvaliacoes(){
        mediaDeAvaliacoes = avaliacao / numAvaliacoes;
        System.out.println("Avaliação média: " + mediaDeAvaliacoes);
    }

}
