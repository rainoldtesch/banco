public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return " Conta [" +
                " numero = " + numero +
                ", agencia = " + agencia +
                ", banco = " + banco + '\'' +
                ", saldo = " + saldo +
                "] ";
    }

    public boolean sacar(double quantia) {
        return false;
    }

    public abstract double depositar(double quantia);
}
