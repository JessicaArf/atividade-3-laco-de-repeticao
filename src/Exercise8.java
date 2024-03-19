import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        /* Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar adivinhá-lo.
        O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0, numberRandom = random.nextInt(100) + 1;

        System.out.println("*** Bem-vindo ao jogo! ***");
        System.out.println("Você deve acertar um número aleatório de 1 ao 100.");

        while (guess != numberRandom) {
            System.out.println("Digite um número, vamos ver se você acerta!");
            guess = scanner.nextInt();
            if (guess == numberRandom) {
                System.out.println("Parabéns você acertou!");
            } else {
                if(guess > numberRandom){
                    System.out.println("Tente um número menor dessa vez.");
                }else{
                    System.out.println("Tente um número maior dessa vez.");
                }
            }
        }
    }
}

