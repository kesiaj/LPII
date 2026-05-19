import java.util.Scanner;

public class Imc {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Digite sua altura (em metros): ");
        float altura = teclado.nextFloat();
    
        float imc = peso / (altura * altura);
        
        if(imc > 30) {
            System.out.println("você está obeso");
        }
        else {
            System.out.println("você não está obeso");
        }
        
        teclado.close();
    }
}