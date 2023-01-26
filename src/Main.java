import db.contaCorrenteDB;
import db.contaPoupancaDB;
import models.Corrente;
import models.Poupanca;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("     =================================");
        System.out.println(" --- | Bem-vindo ao Banco Portifólio | --- ");
        System.out.println("     =================================");
        int option;
        do {
            System.out.println(" ");
            System.out.println(" 1 - Criar nova models.Conta Corrente");
            System.out.println(" 2 - Criar nova models.Conta Poupança");
            System.out.println(" 3 - Criar nova models.Conta Salário");
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
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("-------- CADASTRO DE CONTA CORRENTE --------");
                System.out.print("->> Qual o nome do Banco? ");
                String banco = scanner.nextLine();
                System.out.print("->> Qual a agência da nova conta? ");
                int agencia = scanner.nextInt();
                System.out.print("->> Qual o número da nova conta? ");
                int numero = scanner.nextInt();
                System.out.print("->> Qual o valor de cheque especial? ");
                double chequeEspecial = scanner.nextDouble();

                //Corrente novaContaCorrente = new Corrente();
                //novaContaCorrente.setBanco(banco);
                //novaContaCorrente.setAgencia(agencia);
                //novaContaCorrente.setNumero(numero);
                //novaContaCorrente.setChequeEspecial(chequeEspecial);

                //mensagem de feedback para cadastro de nova conta corrente:
                System.out.println(" ");
                System.out.println("models.Conta corrente criada com sucesso!!!");
                System.out.println("Banco: " + banco + " | Agência: " + agencia + " | models.Conta Corrente número: " + numero);
                System.out.println("Limite de cheque especial: R$ " + chequeEspecial);

                //contaCorrenteDB.addNovaContaCorrente(novaContaCorrente);

                break;
            }

            case 2: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("-------- CADASTRO DE CONTA POUPANÇA --------");
                System.out.print("->> Qual o nome do Banco? ");
                String banco = scanner.nextLine();
                System.out.print("->> Qual a agência da nova conta Poupança? ");
                int agencia = scanner.nextInt();
                System.out.print("->> Qual o número da nova conta Poupança? ");
                int numero = scanner.nextInt();

                //Poupanca novaContaPoupanca = new Poupanca();
                //novaContaPoupanca.setBanco(banco);
                //novaContaPoupanca.setAgencia(agencia);
                //novaContaPoupanca.setNumero(numero);

                //mensagem de feedback para cadastro de nova conta corrente:
                System.out.println(" ");
                System.out.println("models.Conta Poupança criada com sucesso!!!");
                System.out.println("Banco: " + banco + " | Agência: " + agencia + " | models.Conta Poupança número: " + numero);

                //Poupanca novaContaPoupanca = new Poupanca(banco, agencia, numero);
                //contaPoupancaDB.addNovaContaPoupanca(novaContaPoupanca);

                break;
            }
        }
    }
}