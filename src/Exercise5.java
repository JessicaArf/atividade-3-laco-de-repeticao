public class Exercise5 {
    public static void main(String[] args) {
        /* 5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci. */

        int[] fibonacci = new int[20];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);

        for(int i = 2; i < 20; i++){
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            System.out.println(fibonacci[i]);
        }
    }
}
