package desafios;

public class Produto {
    private String nome;
    private double preco;

    //Utilize métodos getters e setters para acessar e modificar esses atributos.


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double desconto) {
        preco -= (desconto / 100) * preco;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Lata de Sardinha");
        produto1.setPreco(12);
        int desconto = 50;

        System.out.println("Preço do(a) " + produto1.getNome() + ": R$ " + produto1.getPreco());
        produto1.aplicarDesconto(desconto);

        System.out.println("Aplicado " + desconto + "% de desconto: R$ " + produto1.getPreco());

    }
}
