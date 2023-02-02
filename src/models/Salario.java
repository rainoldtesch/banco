package models;

public class Salario extends Conta{

    private int quantidadeDeSaques;

    public Salario(String nomeCliente, int agencia, int numero, double saldo) {
        super(nomeCliente, agencia, numero, TipoConta.SALARIO, saldo);
        this.quantidadeDeSaques = quantidadeDeSaques;

    }
}