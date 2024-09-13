package edu.evelyn.conta;

import java.util.Scanner;

/**
 * <h1> Conta Banco </h1>
 * O programa realiza a coleta de dados como nome, agência, número da conta e o saldo, do cliente, e imprime após as informações coletadas.
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 13/09/2024
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("================ Por favor, infome as informações abaixo ================");

        System.out.print(">> Seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print(">> Número da conta: ");
        numero = input.nextInt();

        System.out.print(">> Agência: ");
        agencia = input.next();

        System.out.print(">> Saldo: ");
        saldo = input.nextDouble();

        System.out.println("\n==================== Cadastro Concluído com Sucesso! ====================\n");

        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.\n");


    }
}
