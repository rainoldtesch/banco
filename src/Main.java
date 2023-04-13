import db.ContasDB;
import models.Conta;
import models.Corrente;
import models.Poupanca;
import models.Salario;
import java.util.Scanner;

public class Main {

    static ContasDB contasDB = new ContasDB();

    public static void main(String[] args) throws Exception {
        System.out.println("     =================================");
        System.out.println(" --- | Bem-vindo ao Banco Portifólio | --- ");
        System.out.println("     =================================");
        int option;
        do {
            System.out.println(" ");
            System.out.println(" 1 - Criar nova Conta CORRENTE");
            System.out.println(" 2 - Criar nova Conta POUPANÇA");
            System.out.println(" 3 - Criar nova Conta SALÁRIO");
            System.out.println(" 4 - Listando contas cadastradas");
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
                System.out.print("->> Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("->> Qual a agência da nova conta? ");
                int agencia = scanner.nextInt();
                System.out.print("->> Qual o valor de cheque especial? ");
                double chequeEspecial = scanner.nextDouble();

                //Corrente novaContaCorrente = new Corrente();
                //novaContaCorrente.setNomeCliente(nomeCliente);
                //novaContaCorrente.setAgencia(agencia);
                //novaContaCorrente.setNumero();
                //novaContaCorrente.setTipoConta();
                //ContasDB.addNovaConta(novaContaCorrente);

                //mensagem de feedback para cadastro de nova conta corrente:
                System.out.println(" ");
                System.out.println(" Conta CORRENTE criada com sucesso!!!");
                System.out.println("Cliente: " + nomeCliente + " | Agência: " + agencia + " | Limite de cheque especial: R$ " + chequeEspecial);

                break;
            }

            case 2: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("-------- CADASTRO DE CONTA POUPANÇA --------");
                System.out.print("->> Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("->> Qual a agência da nova conta? ");
                int agencia = scanner.nextInt();

                //Poupanca novaContaPoupanca = new Poupanca();
                //novaContaPoupanca.setNomeCliente(nomeCliente);
                //novaContaPoupanca.setAgencia(agencia);
                //ContasDB.addNovaConta(novaContaPoupanca);

                //mensagem de feedback para cadastro de nova conta corrente:
                System.out.println(" ");
                System.out.println(" Conta POUPANÇA criada com sucesso!!!");
                System.out.println("Cliente: " + nomeCliente + " | Agência: " + agencia);

                break;
            }

            case 3: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("-------- CADASTRO DE CONTA SALÁRIO --------");
                System.out.print("->> Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("->> Qual a agência da nova conta? ");
                int agencia = scanner.nextInt();

                //Salario novaContaSalario = new Salario();
                //novaContaSalario.setNomeCliente(nomeCliente);
                //novaContaSalario.setAgencia(agencia);
                //ContasDB.addNovaConta(novaContaSalario);

                //mensagem de feedback para cadastro de nova conta corrente:
                System.out.println(" ");
                System.out.println(" Conta SALÁRIO criada com sucesso!!!");
                System.out.println("Cliente: " + nomeCliente + " | Agência: " + agencia);

                break;
            }

            case 4: {
                System.out.println("     =================================");
                System.out.println(" --- |  LISTANDO CONTAS CADASTRADAS  | --- ");
                System.out.println("     =================================");

                //for(Conta conta : ContasDB.getContaList()) {
                //    System.out.println("Conta " + conta.getTipoConta());
                //    System.out.println("Nome do cliente: " + conta.getNomeCliente());
                //    System.out.println("Agência: " + conta.getAgencia());
                //    System.out.println("Número: " + conta.getNumero());
                //    System.out.println("Saldo: R$ " + conta.getSaldo());
                //}
                break;
            }

            case 5: {
                System.out.println("     =================================");
                System.out.println(" --- |             SACAR             | --- ");
                System.out.println("     =================================");
                break;
            }

            case 6: {
                System.out.println("     =================================");
                System.out.println(" --- |           DEPOSITAR           | --- ");
                System.out.println("     =================================");
                break;
            }

            case 7: {
                System.out.println("     =================================");
                System.out.println(" --- |           TRANSFERIR          | --- ");
                System.out.println("     =================================");
                break;
            }
        }
    }
}