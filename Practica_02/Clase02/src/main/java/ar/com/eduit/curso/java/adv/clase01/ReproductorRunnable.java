package ar.com.eduit.curso.java.adv.clase01;

import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class ReproductorRunnable implements Runnable{
    public static void main(String[] args) throws Exception{
        new Player(new FileInputStream(new File("res/la llave.mp3"))).play();
    }

    @Override
    public void run() {
        try {
            new Player(new FileInputStream(new File("res/la llave.mp3"))).play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}