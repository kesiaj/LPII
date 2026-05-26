import java.util.Scanner; 

public class SalarioOperario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a quantidade de horas trablhadas: ");
        int horasTrabalhadas = teclado.nextInt();
        double salario = horasTrabalhadas * 20.0;
        System.out.println("O salário do operário é: R$" + salario);
        teclado.close();

    }
}