package desafios;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;


    // Implemente métodos getters e setters para os atributos privados.


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void sacar(double saque){
        saldo -= saque;
    }

    public void depositar(double deposito){
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(1234);
        conta1.setTitular("Gustavo");
        conta1.depositar(1000);

        System.out.println(conta1.getTitular());
        System.out.println(conta1.getNumeroConta());

        System.out.println(conta1.getSaldo());

    }
}
