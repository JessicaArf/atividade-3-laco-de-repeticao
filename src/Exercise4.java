import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /* 4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo:");
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("O número " + number + " é primo!");
        } else {
            System.out.println("O número não é primo.");
        }

        scanner.close();
    }
}