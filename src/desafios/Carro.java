package desafios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println(String.format("""
                Modelo: %s
                Ano: %s
                Cor: %s""", modelo, ano, cor)
        );
    }

    int idadeDoCarro(int anoAtual){
        return anoAtual - ano;
    }
}
