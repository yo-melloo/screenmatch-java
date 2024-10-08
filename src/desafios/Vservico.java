package desafios;

public class Vservico implements Vendavel{
    private String nome;
    private double valor;
    private double precoHora;
    private double horasGastas;
    private double desconto;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setHorasGastas(double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double getHorasGastas() {
        return horasGastas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        valor += precoHora * horasGastas;
        return valor;
    }

    @Override
    public double aplicarDesconto() {
        valor -= (valor * desconto / 100);
        return valor;
    }

    public static void main(String[] args) {
        Vservico servico = new Vservico();

        servico.setNome("Meu serviço");
        servico.setValor(100);
        servico.setPrecoHora(10);
        servico.setHorasGastas(2);
        servico.setDesconto(50);

        System.out.println("Valor do Serviço: " + servico.calcularPrecoFinal());
        System.out.printf("Valor com descontos: " + servico.aplicarDesconto());

    }

}

