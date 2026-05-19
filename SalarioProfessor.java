import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
    
 
        System.out.println("Digite o valor da hora de aula: ");
        float valorAula = teclado.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = teclado.nextInt();
        System.out.println("Digite o percentual de descontos do INSS: ");
        float inss = teclado.nextFloat();

        float salarioBruto = valorAula * horasTrabalhadas;
        float desconto = salarioBruto * (inss/100);
        float salarioLiquido = salarioBruto - desconto;

       
        System.out.println("Seu  salário líquido é: " + salarioLiquido + "R$");
        
        teclado.close();
      
    }
}