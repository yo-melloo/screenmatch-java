package desafios;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.setMarca("Honda");
        meuCarro.setNome("Civic");
        meuCarro.setAno(2022);
        meuCarro.setCor("Prata");
        meuCarro.setModelo("Sedan");
        meuCarro.definirPrecos(22100, 32000, 70000);
        meuCarro.exibirCarro();
        meuCarro.exibirFichaTecnica();

    }
}
