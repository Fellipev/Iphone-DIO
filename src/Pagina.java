public class Pagina {

    private String titulo;

    public Pagina(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
