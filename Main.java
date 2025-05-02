import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
                    mainMenu.handleClienteMenu();
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

}