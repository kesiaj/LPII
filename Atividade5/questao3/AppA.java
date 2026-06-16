package questao3;

public class AppA {

    public static void main(String[] args) {

        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro("Rex", 3,
                "Labrador");

        animais[1] = new Gato("Mimi", 2,
                "Curta");

        animais[2] = new Ave("Loro", 1,
                "Papagaio");

        for (Animal animal : animais) {

            animal.emitirSom();
        }
    }
}