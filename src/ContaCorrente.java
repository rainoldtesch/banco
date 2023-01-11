public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + "Conta Corrente [" +
                " chequeEspecial = " + chequeEspecial +
                "]";
    }

    //implementação método sacar com cheque especial:

    @Override
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

    @Override
    public double depositar(double quantia) {
        this.saldo += quantia;
        return quantia;
    }

    public double getSaldo() { return this.chequeEspecial + this.saldo; }
}
