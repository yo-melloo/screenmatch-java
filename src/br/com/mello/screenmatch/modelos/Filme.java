package br.com.mello.screenmatch.modelos;
import br.com.mello.screematch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) pegaMedia();
    }

}
