public class TestaConta {

    public static void main(String[] args) {

        System.out.println();

        Conta contas[] = new Conta[3];
        ContaCorrente cc = new ContaCorrente(22, 1, "Banco AA", 100.00, 500.00);
        ContaPoupanca cp = new ContaPoupanca(33, 1, "Banco AA", 10.00, 20, 0.01);
        ContaSalario cs = new ContaSalario(44, 1, "Banco AA", 8000.00, 2);

        System.out.println(cs);
        cs.depositar(4000);
        System.out.println(cs);
        System.out.println("O saldo atual é: " + cs.getSaldo());


    }
}
