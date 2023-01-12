import db.contaCorrenteDB;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(" --- Bem-vindo ao Banco Portifólio --- ");
        int option;
        do {
            System.out.println(" ");
            System.out.println(" 1 - Criar nova Conta Corrente");
            System.out.println(" 2 - Criar nova Conta Poupança");
            System.out.println(" 3 - Criar nova Conta Salário");
            System.out.println(" 4 - Mostrar saldo da conta");
            System.out.println(" 5 - Sacar");
            System.out.println(" 6 - Depositar");
            System.out.println(" 7 - Transferir");
            System.out.println(" 0 - Sair do sistema");
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("->> Qual operação deseja realizar? ");
            option = scanner.nextInt();
            process(option);
        } while (option != 0);
    }

    public static void process(int option) throws Exception {
        switch (option) {
            case 1 : {
                Scanner scanner = new Scanner(System.in);

                System.out.println("-------- CADASTRO DE NOVA CONTA CORRENTE --------");
                System.out.print("->> Qual o nome do Banco? ");
                String banco = scanner.nextLine();
                System.out.print("->> Qual a agência da nova conta? ");
                int agencia = scanner.nextInt();
                System.out.print("->> Qual o número da nova conta? ");
                int numero = scanner.nextInt();
                System.out.print("->> Qual o valor de cheque especial? ");
                double chequeEspecial = scanner.nextDouble();

                ContaCorrente novaContaCorrente = new ContaCorrente(banco, agencia, numero, chequeEspecial);

                contaCorrenteDB.addNovaContaCorrente(novaContaCorrente);

                break;
            }

            case 2: {

                break;
            }
}
