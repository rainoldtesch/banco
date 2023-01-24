package models;

public class ContaCorrente { //extends Conta {

    private String banco;
    private int agencia;
    private int numero;
    protected double saldo;

    private double chequeEspecial;

    //métodos getters & setters:
    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getChequeEspecial() { return chequeEspecial; }
    public void setChequeEspecial(double chequeEspecial) { this.chequeEspecial = chequeEspecial; }

    //public ContaCorrente(String banco, int agencia, int numero, double saldo, double chequeEspecial) {
        //super(banco, agencia, numero, saldo);
        //this.chequeEspecial = chequeEspecial;
    //}

    @Override
    public String toString() {
        return "Conta Corrente [ agência:" + agencia +
                "| número: " + numero +
                "| saldo = " + saldo +
                "| cheque Especial = " + chequeEspecial +
                " ]";
    }

    //implementação método sacar com cheque especial:
    //@Override
    public boolean sacar(double quantia) {
        double disponivel = this.chequeEspecial + this.saldo;
        if (quantia > disponivel){
            System.out.println(" -> Você não tem limite disponível na conta corrente!!! ");
            return false;
        }
        else {
            this.saldo -= quantia;
            return true;
        }
    }

    //@Override
    //public double depositar(double quantia) { this.saldo += quantia; return quantia; }

    //public double getSaldo() { return this.chequeEspecial + this.saldo; }
}
