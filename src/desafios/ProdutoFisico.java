package desafios;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private String marca;
    private int idProduto;
    //private double preco;
    private double valor;
    private int impostoPorCento;
    private int descontoPorCento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setImpostoPorCento(int impostoPorCento) {
        this.impostoPorCento = impostoPorCento;
    }

    public void setDescontoPorCento(int descontoPorCento) {
        this.descontoPorCento = descontoPorCento;
    }

    public double getPreco() {
        return valor + (valor * impostoPorCento / 100);
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public double getValor() {
        return valor;
    }

    public double getImpostoPorCento() {
        return impostoPorCento;
    }

    public int getDescontoPorCento() {
        return descontoPorCento;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() - (getPreco() * descontoPorCento / 100);
    }

    public void scanear(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("ID: " + idProduto);
        System.out.println("Valor: " + valor + " R$");
        System.out.println("Impostos: " + impostoPorCento + "%");
        System.out.println("Preço: " + getPreco() + " R$");
        System.out.println("Descontos: " + descontoPorCento + "%");
        System.out.println("Valor final: " + calcularPrecoFinal() + " R$");
    }

    public static void main(String[] args) {
        ProdutoFisico produto = new ProdutoFisico();

        produto.setNome("Meu Produto");
        produto.setMarca("Minha Marca");
        produto.setIdProduto(000000);
        produto.setValor(100);
        produto.setImpostoPorCento(15);
        produto.setDescontoPorCento(10);
        produto.scanear();


    }

}
