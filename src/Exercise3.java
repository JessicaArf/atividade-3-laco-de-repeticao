public class Exercise3 {
   public static void main(String[] args) {

       /* 3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100. */

       int result = 0;

       for( int i = 1; i <= 100; i++){
           if(i % 2 == 0){
               result += i;
           }
       }
       System.out.println(" A soma dos números pares de 1 a 100 é: " + result);
   }
}
