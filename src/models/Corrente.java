package models;

public class Corrente extends Conta {

    public Corrente(String banco, int agencia, int numero, TipoConta tipoConta, double saldo) {
        super(banco, agencia, numero, TipoConta.CORRENTE, saldo);
    }
}
