import java.util.Scanner;

public class CarteiraMotorista {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
        
        if(idade >= 18) {
            System.out.println("Você pode tirar a carteira de motorista");
        }
        else {
            System.out.println("Você não pode tirar a carteira de motorista");
        }
        
        teclado.close();
    }
}
