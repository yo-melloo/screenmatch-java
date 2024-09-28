package desafios;

import java.security.Principal;

public class Livro {
    private String titulo;
    private String autor;

   //Utilize métodos getters e setters para acessar e modificar esses atributos.

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes() {
        System.out.println( String.format("""
                Nome: %s
                Autor: %s""",titulo, autor));
    }

    public static void main(String[] args) {
        Livro novoLivro = new Livro();
        Livro meuLivro = new Livro();

        novoLivro.setAutor("Gustavo");
        novoLivro.setTitulo("Dungeon Man: Maze!");

        meuLivro.setAutor("Gustavo Mello"); // intencionalmente errado
        meuLivro.setTitulo("Lógica de Programadão");


        novoLivro.exibirDetalhes();
        meuLivro.exibirDetalhes();
    }
}
