import java.util.Date;

public abstract class Conta {
    private String banco;
    private int agencia;
    private int numero;
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public Conta(String banco, int agencia, int numero, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //métodos Getters & setters:
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return " Conta [" +
                " Banco = " + banco +
                ", Agência = " + agencia +
                ", Número = " + numero + '\'' +
                ", Saldo = " + saldo +
                "] ";
    }

    public boolean sacar(double quantia) {
        return false;
    }

    public abstract double depositar(double quantia);
}
