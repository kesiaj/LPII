import java.util.Scanner;

public class Temperatura {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua temperatura: ");
        float temperatura = teclado.nextFloat();
        
        if(temperatura > 37) {
            System.out.println("Você está com febre");
        }
        else {
            System.out.println("Sua temperatura está normal");
        }
        
        teclado.close();
    }
}