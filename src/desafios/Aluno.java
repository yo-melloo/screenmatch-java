package desafios;

public class Aluno {
    String nome;
    int idade;

    void exibirInformacoes(){
        System.out.println(String.format("""
                Nome do Aluno: %s
                Idade: %s""", nome,idade));
    }
}
