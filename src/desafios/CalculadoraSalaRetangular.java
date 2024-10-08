package desafios;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return (getAltura() * getLargura());
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (getAltura() + getLargura());
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        calculadora.setAltura(10);
        calculadora.setLargura(12);

        double area = calculadora.calcularArea();
        double perimetro = calculadora.calcularPerimetro();

        System.out.println("Perimetro: " + perimetro + "cm");
        System.out.println("Área: " + area + "cm²");


    }

}
