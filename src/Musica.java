public class Musica {

    private String titulo;
    private String compositor;
    private double duracao;

    public Musica(String titulo, String compositor, double duracao) {
        this.titulo = titulo;
        this.compositor = compositor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCompositor() {
        return compositor;
    }

    public double getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        String musica = "Musica: " + this.titulo;
        musica += "\n" + this.compositor + "\n";
        musica += "00:00 o----------------- " + this.duracao;

        return musica;
    }
}
