package desafios;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    double ano1Preco, ano2Preco, ano3Preco;

    public void definirPrecos(double preco1, double preco2, double preco3){
        ano1Preco = preco1;
        ano2Preco = preco2;
        ano3Preco = preco3;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    int idadeDoCarro(int anoAtual){
        return anoAtual - ano;
    }


    //definir o nome do modelo,
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //calcular e exibir o menor e o maior preço.
    public double calcularMenorPreco(){
        double menorPreco = ano1Preco;

        if (menorPreco > ano2Preco){
            menorPreco = ano2Preco;
        }

        if (menorPreco > ano3Preco){
            menorPreco = ano3Preco;
        }

        return menorPreco;

    }

    public double calcularMaiorPreco(){
        double maiorPreco = ano1Preco;

        if (maiorPreco < ano2Preco){
            maiorPreco = ano2Preco;
        }

        if (maiorPreco < ano3Preco){
            maiorPreco = ano3Preco;
        }

        return maiorPreco;

    }

    //representar um modelo específico ao longo de três anos.
    void exibirFichaTecnica(){
        System.out.println(String.format("""
                Modelo: %s
                Ano: %s (%s anos)
                Cor: %s
                Preco ano 1: %.2f
                Preço ano 2: %.2f
                Preço ano 3: %.2f
                Menor Preço: %.2f
                Maior Preço: %.2f""", modelo, ano, idadeDoCarro(2024), cor, ano1Preco, ano2Preco, ano3Preco, calcularMenorPreco(), calcularMaiorPreco())
        );
    }

}