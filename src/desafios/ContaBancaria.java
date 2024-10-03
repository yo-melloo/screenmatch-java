package desafios;

import java.sql.SQLOutput;

public class ContaBancaria {


    private int numeroConta;
    protected double saldo;
    public String titular;


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
        double preSaldo = saldo;
        saldo -= saque;

        System.out.printf("Sacando R$ %.2f %n", saque);
        System.out.printf("Saldo: R$ %.2f --> R$ %.2f %n", preSaldo, saldo);
    }

    public void depositar(double deposito){
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    /*
        public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(1234);
        conta1.setTitular("Gustavo");
        conta1.depositar(1000);

        System.out.println(conta1.getTitular());
        System.out.println(conta1.getNumeroConta());

        System.out.println(conta1.getSaldo());

    }
    */

    public void consultarSaldo(){
        System.out.printf("""
                Titular: %s
                Número da Conta: %s
                Saldo: R$ %.2f
                Tipo da Conta: Conta Corrente
                """, titular,numeroConta,saldo);
    }

}
