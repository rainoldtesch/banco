package models;

public class Cliente implements Autenticador{
    private String nome;
    private boolean status;
    private String senha;

    public Cliente(String nome, boolean status, String senha) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
    }

    public String getNome() { return nome; }

    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return "Cliente | " +
                "nome='" + nome + '\'' +
                "| status=" + status +
                "| senha='" + senha + '\'' +
                '|';
    }

    @Override
    public boolean autentica(String senha) {
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
