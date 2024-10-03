package desafios;

public class TesteBanco {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();

        minhaConta.depositar(100);
        minhaConta.setTitular("Gustavo Mello");
        minhaConta.setNumeroConta(1234);


        minhaConta.consultarSaldo();
        minhaConta.sacar(10);
        minhaConta.cobrarTarifaMensal();

        minhaConta.sacar(50);
        minhaConta.consultarSaldo();

    }

}
