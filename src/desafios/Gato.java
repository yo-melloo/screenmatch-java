package desafios;

public class Gato extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }

    public void arranharMoveis(String movel){
        System.out.println("Arranhando " + movel);
    }
}
