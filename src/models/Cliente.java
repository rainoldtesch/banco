package models;

public class Cliente implements Autenticador{
    private String nomeCliente;
    private boolean status;
    private String senha;

    public Cliente(String nomeCliente, boolean status, String senha) {
        this.nomeCliente = nomeCliente;
        this.status = status;
        this.senha = senha;
    }

    public String getNome() { return nomeCliente; }

    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return "Cliente | " +
                "nome='" + nomeCliente + '\'' +
                "| status=" + status +
                "| senha='" + senha + '\'' +
                '|';
    }

    @Override
    public boolean autentica (String senha) {
        if (this.senha != senha) {
            System.out.println("Não autenticado!");
            return false;
        }
        else {
            System.out.println("Autenticado!!!");
            return true;
        }
    }
}
