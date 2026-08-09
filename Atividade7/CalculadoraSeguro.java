package Atividade7;
import java.util.Scanner;

public class CalculadoraSeguro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a idade do condutor: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o valor do veículo: ");
            double valorVeiculo = scanner.nextDouble();

            if (idade < 18) {
                throw new IdadeInvalidaException(
                    "Erro: Idade do condutor inválida!"
                );
            }

            if (valorVeiculo <= 0) {
                throw new IllegalArgumentException(
                    "Erro: O valor do veículo deve ser maior que zero!"
                );
            }

            double percentualSeguro = 0.05;

            if (idade < 25) {
                percentualSeguro += 0.02;
            }

            double valorSeguro = valorVeiculo * percentualSeguro;

            System.out.println("Valor do seguro: R$ " + valorSeguro);

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Processo encerrado.");
            scanner.close();
        }
    }
}

