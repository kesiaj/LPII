import java.util.Scanner;

public class MaiorNumero{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        do { 
            System.out.println("Digite o primeiro número: ");
            num1 = teclado.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = teclado.nextInt();

            if(num2 == num1) {
                System.out.println("Os números não devem ser iguais");
            }
        } while (num1 == num2);
        
        if(num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        }
        else {
            System.out.println(num2 + " é maior que " + num1);
        }
        
        teclado.close();
    }
}