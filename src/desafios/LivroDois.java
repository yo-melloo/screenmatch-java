package desafios;

public class LivroDois implements Calculavel{
    private String titulo;
    private String autor;
    private int ano;
    private int codBiblioteca;
    private double preco;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCodBiblioteca(int codBiblioteca) {
        this.codBiblioteca = codBiblioteca;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public int getCodBiblioteca() {
        return codBiblioteca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * 0.09);
    }

    public void mostrar(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano " + ano);
        System.out.println("Cód.: " + codBiblioteca);
        System.out.println("Valor: " + calcularPrecoFinal());
    }

    public static void main(String[] args) {
        LivroDois livro = new LivroDois();

        livro.setTitulo("Meu livro");
        livro.setAutor("Eu");
        livro.setAno(2024);
        livro.setCodBiblioteca(12345678);
        livro.setPreco(220);
        livro.mostrar();
    }
}
