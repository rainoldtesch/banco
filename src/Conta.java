import java.util.Date;

public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
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
