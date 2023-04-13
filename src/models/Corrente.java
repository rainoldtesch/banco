package models;

public class Corrente extends Conta {

    private double chequeEspecial;

    public Corrente(String nomeCliente, int agencia, int numero, double saldo, double chequeEspecial) {
        super (nomeCliente, agencia, numero, TipoConta.CORRENTE, saldo);
        this.chequeEspecial = chequeEspecial;
    }
}
