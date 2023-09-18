public class Iphone {
    public static void main(String[] args) {

        ReprodutorMusical itunes = new ReprodutorMusical();

        itunes.adicionarMusica("Oceano", "Djavan", 4.54);
        itunes.adicionarMusica("I know It`s Over", "The Smiths", 5.49);
        itunes.adicionarMusica("Bigmouth Strikes Again", "The Smiths", 3.13);
        itunes.adicionarMusica("The Killing Moon", "Echo & the Bunnymen", 5.48);

        itunes.exibirPlaylist();
        itunes.play(); //Oceano
        itunes.proximaMusica(); //I know its over
        itunes.proximaMusica(); //Bigmouth
        itunes.voltarMusica(); //I know its over

        Telefone telefone = new Telefone();
        telefone.adicionarContato("Fellipe", 943451718);
        telefone.adicionarContato("Giovanna", 91111111);
        telefone.adicionarContato("Carlos", 555555555);
        telefone.ligar(943451718);

        Internet navegador = new Internet();
        navegador.adicionarNovaAba("Google");
        navegador.adicionarNovaAba("Facebook");
        navegador.adicionarNovaAba("Dio");
        navegador.adicionarNovaAba("Linkedin");
        navegador.atualizarPagina("Dio");

    }
}
