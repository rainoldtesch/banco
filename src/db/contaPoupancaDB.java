package db;

import models.Poupanca;
import java.util.ArrayList;
import java.util.List;

public class contaPoupancaDB {
    private List<Poupanca> contaPoupancasList = new ArrayList<>();

    public List<Poupanca> getContaPoupancasList() {
        return contaPoupancasList;
    }

    public void addNovaContaPoupanca(Poupanca contaPoupanca) {
        contaPoupancasList.add(contaPoupanca);
    }
}
