package br.com.mello.screenmatch.excecoes;

public class ExcecaoDeConversaoDeAno extends RuntimeException {
    String mensagem;

    public ExcecaoDeConversaoDeAno (String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
