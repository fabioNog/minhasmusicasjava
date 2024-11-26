package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Rust");
        minhaMusica.setCantor("Black Label Society");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 4000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 2000; i++) {
            meuPodcast.curte();
        }
    }
}
