package desafios;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (getTemperatura() - 32) / 1.8 ;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (getTemperatura() * 1.8) + 32;
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorDeTemperatura = new ConversorTemperaturaPadrao();
        double temperaturaNova;

        conversorDeTemperatura.setTemperatura(100);
        temperaturaNova = conversorDeTemperatura.celsiusParaFahrenheit();

        System.out.println("Temperaturas");
        System.out.println("Celsius para Fahrenheit:");
        System.out.println(conversorDeTemperatura.getTemperatura() + "C ---> " + temperaturaNova + "F");

        conversorDeTemperatura.setTemperatura(temperaturaNova);
        temperaturaNova = conversorDeTemperatura.fahrenheitParaCelsius();

        System.out.println("Fahrenheit para Celsius:");
        System.out.println(conversorDeTemperatura.getTemperatura() + "C ---> " + temperaturaNova + "F");



    }

}
