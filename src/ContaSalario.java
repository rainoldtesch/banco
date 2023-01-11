public class ContaSalario extends Conta {
    private int quantidadeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeSaques) {
        super(numero, agencia, banco, saldo);
        this.quantidadeSaques = quantidadeSaques;
    }

    @Override
    public double getSaldo() { return this.saldo; }

    @Override
    public boolean sacar(double quantia) {
        if (quantia > saldo) {
            System.out.println("Saldo insuficiente na conta salário!!!");
            return false;
        }
        else {
            if (this.quantidadeSaques > 0) {
                this.quantidadeSaques--;
                this.saldo -= quantia;
                return true;
            }
            else {
                System.out.println(" -> Limite de saques excedido em sua conta salário!");
                return false;
            }
        }
    }

    @Override
    public double depositar(double quantia) {
        this.saldo += quantia;
        return saldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Conta Salario [" +
                "Limite de 2 saques" +
                ']';
    }
}
