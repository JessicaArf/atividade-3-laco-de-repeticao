import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        /* 10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
         O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
         O programa deve continuar executando até que o usuário decida sair. */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        String item;

        while (true) {

            System.out.println("**** Lista de compras ****");
            System.out.println("Selecione a opção desejada:  ");
            System.out.println("1 - Adicionar itens\n" +
                    "2 - Visualizar sua lista de compras\n" +
                    "3 - Sair");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Qual item deseja adicionar à sua lista?");
                    item = scanner.nextLine();
                    list.add(item);
                    System.out.println("Item adicionado com sucesso!");
                    System.out.println("Segue sua lista de compras atualizada:");
                    for (String itemList : list) {
                        System.out.println(itemList);
                    }
                    break;
                case 2:
                    System.out.println("Aqui está sua lista de compras:");
                    for (String itemList : list) {
                        System.out.println(itemList);
                    }
                    break;
                case 3:
                    System.out.println("Sair!");
                    return;
                default:
                    System.out.println("Opção inválida.");

            }
        }
    }
}
