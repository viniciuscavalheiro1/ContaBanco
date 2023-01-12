import Data.DataBase;
import entities.Conta;
import services.Funcoes;
import services.Menus;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        DataBase data = new DataBase();
        int op = 0;
        do {
            Menus.MenuPrincipal();
            System.out.println(Funcoes.criarConta(data));
        } while(op != 0);

        System.out.println(data.contas.get(0).toString());

    }
}
