import java.util.Date;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(String banco, int agencia, int numero, double saldo, double chequeEspecial) {
        super(banco, agencia, numero, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(String banco, int agencia, int numero, double chequeEspecial) {
        super(banco, agencia, numero, chequeEspecial);
    }

    @Override
    public String toString() {
        return "Conta Corrente [ " +
                "saldo = " + saldo +
                ", cheque Especial = " + chequeEspecial +
                " ]";
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
