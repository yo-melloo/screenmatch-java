package desafios;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota2 +nota4) / 4;
    }

    public static void main(String[] args) {
        Aluno gustavo = new Aluno();

        gustavo.setNome("Gustavo");
        gustavo.setNota1(9);
        gustavo.setNota2(9.5);
        gustavo.setNota3(8);
        gustavo.setNota4(10);

        double mediaDasNotas = gustavo.calcularMedia();

        System.out.println("Notas de " + gustavo.getNome() + ":");
        System.out.println("Nota 1: " + gustavo.getNota1());
        System.out.println("Nota 2: " + gustavo.getNota2());
        System.out.println("Nota 3: " + gustavo.getNota3());
        System.out.println("Nota 4: " + gustavo.getNota4());

        System.out.println("Media das notas: " + mediaDasNotas);

    }

}
