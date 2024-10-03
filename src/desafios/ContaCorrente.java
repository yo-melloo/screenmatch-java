package desafios;

import java.io.FilterOutputStream;

public class ContaCorrente extends ContaBancaria {
    private double tarifa = 26.59;

    public void cobrarTarifaMensal() {
        double preSaldo = this.saldo;
        this.saldo -= tarifa;

        System.out.printf("Foi cobrado R$ %.2f de tarifa, descontados da conta. %n", tarifa);
        System.out.printf("Saldo: %.2f ->> %.2f %n", preSaldo, saldo);
    }
}
