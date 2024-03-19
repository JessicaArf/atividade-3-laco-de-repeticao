import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        /* 2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int multiplication = number * i;
            System.out.println(number + "x" + i + "= " + multiplication);
        }

        scanner.close();
    }

}
