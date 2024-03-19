import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        /* Faça um programa que solicite ao usuário números inteiros positivos.
        Quando o usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento. */

        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número inteiro positivo: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Você digitou um número negativo!");
                break;
            }

            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("Não foi inserido nenhum número positivo.");
        } else {
            double average = (double) sum / count;
            System.out.println("A média dos números inseridos é: " + average);
        }
        scanner.close();
    }
}
