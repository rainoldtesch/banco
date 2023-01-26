package models;

public class Salario extends Conta{
    public Salario(String banco, int agencia, int numero, TipoConta tipoConta, double saldo) {
        super(banco, agencia, numero, TipoConta.SALARIO, saldo);
    }
}
