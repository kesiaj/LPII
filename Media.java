import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a nota da segunda prova: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a nota do trabalho: ");
        float nota3 = teclado.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 7) {
            System.out.println("aprovado");
        }
        else {
            System.out.println("reprovado");
        }
        
        teclado.close();
    }
}