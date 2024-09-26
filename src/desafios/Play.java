package desafios;

public class Play {
    public static void main(String[] args) {
        Pessoa gustavo = new Pessoa();
        Pessoa fulano = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Musica hinoNacional = new Musica();
        Musica lonelyDay = new Musica();
        Carro fiatUno = new Carro();
        Aluno ciclano = new Aluno();

        gustavo.nome = "Gustavo";
        gustavo.sobrenome = "Mello";

        fulano.nome = "Fulano";
        fulano.sobrenome = "Beltranez";

        hinoNacional.titulo = "Hino Nacional Brasileiro";
        hinoNacional.album = "N/A";
        hinoNacional.anoLancamento = 1882;
        hinoNacional.artista = "Francisco Manuel da Silva";

        lonelyDay.titulo = "Lonely Day";
        lonelyDay.artista = "System Of A Down";
        lonelyDay.anoLancamento = 2005;
        lonelyDay.album = "Hypnotize";

        fiatUno.ano = 2004;
        fiatUno.modelo = "Fiat Uno";
        fiatUno.cor = "Prata";

        ciclano.nome = "Ciclano da Silva";
        ciclano.idade = 22;

        gustavo.dizOi();
        fulano.dizOi();

        System.out.println(calculadora.dobrarNumero(7));

        hinoNacional.avaliarEm(9.8);
        hinoNacional.avaliarEm(5.3);
        hinoNacional.exibirFichaTecnica();

        lonelyDay.avaliarEm(10);
        lonelyDay.avaliarEm(9.5);
        lonelyDay.exibirFichaTecnica();

        fiatUno.exibirFichaTecnica();
        System.out.println(fiatUno.idadeDoCarro(2024) + " anos.\n");

        ciclano.exibirInformacoes();

    }
}
