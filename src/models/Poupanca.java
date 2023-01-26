package models;

public class Poupanca extends Conta{
    public Poupanca(String banco, int agencia, int numero, TipoConta tipoConta, double saldo) {
        super(banco, agencia, numero, TipoConta.POUPANCA, saldo);
    }
}
