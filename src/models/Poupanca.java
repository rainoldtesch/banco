package models;

public class Poupanca extends Conta{

    private int diaAniversario;
    private double taxaDeJuros;

    public Poupanca(String nomeCliente, int agencia, int numero, double saldo) {
        super(nomeCliente, agencia, numero, TipoConta.POUPANCA, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }
}
