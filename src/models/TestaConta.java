package models;

import java.util.Arrays;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {
        Corrente cc1 = new Corrente ("Silva",1,1,1000,10000);
        Corrente cc2 = new Corrente("Souza", 1, 2, 2000, 8000);
        Corrente cc3 = new Corrente("Reis", 1, 3, 5000, 6000);

        List<Corrente> contas = Arrays.asList(cc1, cc2, cc3);

        //for-each tradicional
        for (Corrente conta : contas) {
            System.out.println(conta);
        }

        Cliente cli1 = new Cliente("Silva", true, "123");
        Cliente cli2 = new Cliente("Souza", true, "abc");

        //testar o método autentica:
        cli1.autentica("456");
        cli2.autentica("abc");

        //aqui tesmos outra forma para testar o código com for-each:
        List<Cliente> clientes = Arrays.asList(cli1, cli2);
        MostraCliente mostraCliente = new MostraCliente();
        clientes.forEach(mostraCliente);
    }
}
