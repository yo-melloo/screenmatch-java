package desafios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("não maior de idade");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Gustavo");
        pessoa1.setIdade(21);

        pessoa1.verificarIdade();

    }
}
