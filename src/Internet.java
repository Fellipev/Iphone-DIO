import java.util.ArrayList;
import java.util.List;

public class Internet {
    private List<Pagina> paginas;

    public Internet() {
        this.paginas = new ArrayList<>();
    }

    public void adicionarNovaAba(String titulo) {
        this.paginas.add(new Pagina(titulo));
    }

    public void atualizarPagina(String titulo) {
        Pagina pagina = null;
        for (Pagina p : this.paginas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                pagina = p;
            }
        }

        if (pagina != null) {
            System.out.println("Pagina "+ pagina.getTitulo() + " atualizada!");
        } else {
            System.out.println("Pagina nao encontrada.");
        }

    }

}
