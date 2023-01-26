package models;

public abstract class Conta {
    private String banco;
    private int agencia;
    private int numero;
    private TipoConta tipoConta;
    protected double saldo;

    public Conta(String banco, int agencia, int numero, TipoConta tipoConta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    //Métodos Getters & Setters:

    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public TipoConta getTipoConta() { return tipoConta; }
    public void setTipoConta(TipoConta tipoConta) { this.tipoConta = tipoConta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}
