package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contaCorrenteDB<Conta> {
    private Map<Integer, Conta> contasMap = new HashMap<>();

    public List<Conta> getContasList() {
        List<Conta> contas = new ArrayList<>();
        for (Map.Entry<Integer, Conta> conta : contasMap.entrySet()) {
            contas.add(conta.getValue());
        }
        return contas;
    }

    //public void addNovaContaCorrente(models.Conta conta) { contasMap.put(conta.getNumero()); }

    //public contaCorrenteDB getContaPorNumero(int numero) { return contasMap.get(numero); }
}
