import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        /* 9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao usuário qual conversão deseja fazer.
        O programa deve continuar executando até que o usuário decida sair.  */

        Scanner scanner = new Scanner(System.in);
        double conversion;
        boolean exit = false;

        System.out.println("***** Bem-vindo! *****");

        while (!exit) {

            System.out.println("Qual conversão deseja realizar?");
            System.out.println("1 - De Celsius para Fahrenheit\n" +
                    "2 - De Farenheit para Celsius \n");
            int option = scanner.nextInt();
            System.out.println("Digite a temperatura: ");
            double temp = scanner.nextDouble();

            switch (option) {
                case 1:
                    conversion = (temp * 1.8) + 32;
                    System.out.println("A temperatura " + temp + "ºC é " + String.format("%.1f", conversion) + "ºF em Farenheit.");
                    break;
                case 2:
                    conversion = (temp - 32) / 1.8;
                    System.out.println("A temperatura " + temp + "ºF é " + String.format("%.1f", conversion) + "ºC em Celsius.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("Deseja realizar outra conversão? \n 1 - Sim \n 2 - Não");
            int optionExit = scanner.nextInt();
            if (optionExit == 2) {
                exit = true;
            }
        }
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

