package desafios;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void mostrarTabuada() {
        if (numero >= 0) {
            for (int i = 0; i <= 10; i++) {
                int m = numero * i;
                System.out.println(numero + " x " + i + " = " + m);
                System.out.println("--------------");
            }
        } else {
            System.out.println("Número não definido.");
        }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao multiplicacao = new TabuadaMultiplicacao();

        multiplicacao.setNumero(2);
        multiplicacao.mostrarTabuada();

    }
}
