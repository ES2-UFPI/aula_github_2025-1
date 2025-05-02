import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
        int selection;

        do {
            selection = mainMenu.getSelection();
            switch (selection) {
                case 1:
                    System.out.println("Conta foi selecionada");
                    break;
                case 2:
                    handleCliente();
                    break;
                case 3:
                    System.out.println("Operacoes foi selecionada");
                    break;
                case 4:
                    System.out.println("Sair foi selecionado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (selection != 4);

        System.out.println("Fim");
    }

    private static void handleCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Cliente:");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco);
        System.out.println("Cliente criado com sucesso: " + cliente);
    }
}