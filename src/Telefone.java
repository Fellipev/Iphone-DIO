import java.util.ArrayList;
import java.util.List;

public class Telefone {
    private boolean tocando;
    private boolean correioVoz;

    private List<Contato> contatos;

    public Telefone() {
        this.contatos = new ArrayList<>();
        this.tocando = false;
        this.correioVoz = false;
    }

    public void adicionarContato(String nome, long telefone){
        this.contatos.add(new Contato(nome, telefone));
        System.out.println("Contato "+nome+" adicionado!");
    }

    public void removerContato(long numero) {
        List<Contato> contatoRemover = null;

        for (Contato c : this.contatos) {
            if (c.getTelefone() == numero){
                contatoRemover.add(c);
                break;
            }
        }

        if (!contatoRemover.isEmpty()) {
            this.contatos.removeAll(contatoRemover);
            System.out.println("Contato removido!");
        }
    }

    public void iniciarCorreioDeVoz() {
        this.correioVoz = true;
    }

    public void ligar(long numero){
        Contato contato = null;
        for (Contato c : this.contatos) {
            if (c.getTelefone() == numero) {
                contato = c;
                break;
            }
        }
        if (contato == null) {
            System.out.println("Ligando para " + numero);
        } else {
            System.out.println("Ligando para " + contato.getNome());
        }
    }

    public void recebendoLigacao(long numero, boolean atender) {
        System.out.println("Recebendo ligacao de " + numero);
        if (atender) {
            System.out.println("Voce atendeu a ligacao.");
        } else {
            System.out.println("Voce recusou a ligacao.");
        }
    }
}
