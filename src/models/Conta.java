package models;

public abstract class Conta {
    private String nomeCliente;
    private int agencia;
    private int numero;
    private TipoConta tipoConta;
    protected double saldo;

    public Conta(String nomeCliente, int agencia, int numero, TipoConta tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    //Métodos Getters & Setters:

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public TipoConta getTipoConta() { return tipoConta; }
    public void setTipoConta(TipoConta tipoConta) { this.tipoConta = tipoConta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}
