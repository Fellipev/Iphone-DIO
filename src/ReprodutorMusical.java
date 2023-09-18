import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private static int contador = 0;
    private List<Musica> playlist;
    private boolean estadoMusica;
    private Musica reproduzindo;

    public ReprodutorMusical(){
        this.playlist = new ArrayList<>();
        this.estadoMusica = false;
    }

    public List<Musica> getPlaylist() {
        return playlist;
    }

    public boolean isEstadoMusica() {
        return estadoMusica;
    }

    public Musica getReproduzindo() {
        return reproduzindo;
    }

    public void adicionarMusica(String titulo, String compositor, double duracao) {
        this.playlist.add(new Musica(titulo, compositor, duracao));
    }


    public void play(){
        System.out.println("Tocando agora!");
        System.out.println(this.playlist.get(contador).toString());
        this.estadoMusica = true;
        contador++;
    }

    public void play(String comando){

        if(comando.equalsIgnoreCase("proxima")) {
            System.out.println("Tocando agora!");
            System.out.println(this.playlist.get(contador).toString());
            this.estadoMusica = true;
            contador++;
        } else if (comando.equalsIgnoreCase("voltar")) {
            contador -= 2;
            System.out.println("Tocando agora!");
            System.out.println(this.playlist.get(contador).toString());
            this.estadoMusica = true;
        }
    }

    public void pausarMusica() {
        this.estadoMusica = false;
    }

    public void proximaMusica(){
        play("proxima");
    }

    public void voltarMusica() {
        play("voltar");
    }

    public void exibirPlaylist() {
        for(Musica musica : this.playlist) {
            System.out.println(musica.getTitulo());
        }
    }


}
