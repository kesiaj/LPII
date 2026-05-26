import java.util.Scanner;

public class CustoGasolina {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quatidade de quilometros que serão percorridos: ");
        float distancia = teclado.nextFloat();
        System.out.println("Digite o preço atual da gasolina: ");
        float valorGasolina = teclado.nextFloat();
        float gastoTotal = (distancia / 12) * valorGasolina;
        System.out.println("O gasto total será: " + gastoTotal + "R$");
        teclado.close();
    }
}