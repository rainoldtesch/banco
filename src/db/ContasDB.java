package db;

import models.Conta;
import models.Corrente;
import models.Poupanca;
import models.Salario;

import java.util.ArrayList;
import java.util.List;

public class ContasDB {
    public List<Conta> contaList = new ArrayList<>();

    public List<Conta> getContaList() {
        return contaList;
    }

    public void addNovaConta(Conta conta) {
        int numero = contaList.size() + 1;
        conta.setNumero(numero);
        contaList.add(conta);
    }
}
