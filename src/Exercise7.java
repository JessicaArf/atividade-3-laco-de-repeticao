import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        /*Crie uma calculadora simples que permita ao usuário realizar operações de soma,
        subtração, multiplicação e divisão entre dois números, utilizando um laço de repetição
        para continuar operando até que o usuário decida sair.
        */

        Scanner scanner = new Scanner(System.in);
        double result;
        boolean exit = false;

        System.out.println("***** Bem-vindo à calculadora! *****");

        while (!exit) {

            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicação\n" +
                    "4 - Divisão");

            int option = scanner.nextInt();
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            switch (option) {
                case 1:
                    result = num1 + num2;
                    System.out.println("O resultado é : " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("O resultado é : " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("O resultado é : " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("O resultado é : " + result);
                    } else {
                        System.out.println("Não é possível realizar divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Deseja continuar a operação? \n 1 - Sim \n 2 - Não");
            int optionExit = scanner.nextInt();
            if (optionExit == 2) {
                exit = true;
            }
        }
        System.out.println("Calculadora encerrada.");
        scanner.close();
    }

}

