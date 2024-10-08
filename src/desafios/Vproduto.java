package desafios;

public class Vproduto implements Vendavel{

    private String nome;
    private double preco;
    private double tributosPorCento;
    private int descontoPorCento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescontoPorCento(int descontoPorCento) {
        this.descontoPorCento = descontoPorCento;
    }

    public void setTributosPorCento(double tributosPorCento) {
        this.tributosPorCento = tributosPorCento;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getTributosPorCento() {
        return tributosPorCento;
    }

    public int getDescontoPorCento() {
        return descontoPorCento;
    }

    @Override
    public double calcularPrecoFinal() {
        preco += tributosPorCento;
        return preco;
    }

    @Override
    public double aplicarDesconto() {
        preco -= (preco * descontoPorCento / 100);
        return preco;
    }

    public static void main(String[] args) {
        Vproduto produto = new Vproduto();

        produto.setNome("Meu produto");
        produto.setPreco(90);
        produto.setTributosPorCento(10);
        produto.setDescontoPorCento(25);

        produto.calcularPrecoFinal();
        System.out.println("Preço (já com tributos): " + produto.getPreco());

        produto.aplicarDesconto();
        System.out.println("Preço com descontos aplicados: " + produto.getPreco());

    }
}
