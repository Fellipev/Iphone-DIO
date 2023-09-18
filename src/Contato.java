public class Contato {
    private String nome;
    private long telefone;

    public Contato(String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public long getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + this.nome + '\'' +
                ", telefone=" + this.telefone +
                '}';
    }
}
