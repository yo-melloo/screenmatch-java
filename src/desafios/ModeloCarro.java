package desafios;

public class ModeloCarro extends Carro {
    private String nome;
    private String marca;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void exibirCarro(){
        System.out.println(String.format("""
                %s %s""", getMarca(), getNome(), getAno()));
    }
}
