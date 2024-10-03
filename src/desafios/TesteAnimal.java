package desafios;

public class TesteAnimal {
    public static void main(String[] args) {
        Gato nix = new Gato();
        Cachorro faisca = new Cachorro();

        nix.arranharMoveis("mesa do computador");
        nix.emitirSom();

        faisca.abanarRabo();
        faisca.emitirSom();

    }
}
