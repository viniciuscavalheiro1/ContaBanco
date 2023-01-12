package services;

import Data.DataBase;
import entities.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class Funcoes {

    public static String criarConta(DataBase data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero da conta: ");
        Integer numeroConta = scanner.nextInt();
        System.out.println("Informe o numero da agencia: ");
        scanner.nextLine();
        String agencia = scanner.nextLine();
        System.out.println("Informe o numero da nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Conta conta = new Conta(numeroConta, agencia, nomeCliente);
        data.contas.add(conta);
        return "Conta criada com sucesso!";
    }
}
