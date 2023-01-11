public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSaldo(int dia) {
        if (dia >= diaAniversario) {
            this.saldo = this.saldo + this.taxaDeJuros * this.saldo;
            return this.saldo;
        }
        return this.saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia > saldo) {
            System.out.println(" -> Você não tem saldo suficiente, na poupança, para esse valor de saque!!! ");
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

    @Override
    public String toString() {
        return super.toString() + "Conta Poupanca [" +
                " diaAniversario = " + diaAniversario +
                ", taxaDeJuros = " + taxaDeJuros +
                ']';
    }
}
