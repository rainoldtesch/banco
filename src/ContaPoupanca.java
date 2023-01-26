package models;

public class ContaPoupanca { //extends Conta {

    private String banco;
    private int agencia;
    private int numero;
    protected double saldo;

    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca() {
        //super(banco, agencia, numero, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    //métodos get & set

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

    public int getDiaAniversario() { return diaAniversario; }
    public void setDiaAniversario(int diaAniversario) { this.diaAniversario = diaAniversario; }

    public double getTaxaDeJuros() { return taxaDeJuros; }
    public void setTaxaDeJuros(double taxaDeJuros) { this.taxaDeJuros = taxaDeJuros; }

    //public double getSaldo(int dia) {
        //if (dia >= diaAniversario) {
            //this.saldo = this.saldo + this.taxaDeJuros * this.saldo;
            //return this.saldo;
        //}
        //return this.saldo;
    //}

    //@Override
    //public boolean sacar(double quantia) {
      //  if (quantia > saldo) {
        //    System.out.println(" -> Você não tem saldo suficiente, na poupança, para esse valor de saque!!! ");
        //    return false;
        //}
        //else {
        //    this.saldo -= quantia;
        //    return true;
        //}
    //}

    //@Override
    //public double depositar(double quantia) {
    //    this.saldo += quantia;
    //    return quantia;
    //}

    @Override
    public String toString() {
        return super.toString() + "Conta Poupanca [" +
                " diaAniversario = " + diaAniversario +
                ", taxaDeJuros = " + taxaDeJuros +
                ']';
    }
}
