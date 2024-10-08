
package desafios;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorEmDolar;
    private double valorEmReal;

    public double getValorEmReal() {
        return valorEmReal;
    }

    public void setValorEmReal(double valorEmReal) {
        this.valorEmReal = valorEmReal;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return getValorEmReal() * getValorEmDolar();
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorEmReal = 19.99;
        double valorEmDolar = 5.80;

        conversor.setValorEmReal(valorEmReal);
        conversor.setValorEmDolar(valorEmDolar);
        double valorConvertido = conversor.converterDolarParaReal();

        System.out.printf("O valor de R$ %.2f em Dólares (%.2f U$) equivale a R$ %.2f", valorEmReal, valorEmDolar, valorConvertido);
    }
}
