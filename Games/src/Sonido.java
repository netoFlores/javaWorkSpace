import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author neto
 */
public class Sonido {

    public static void main(String[] args) throws InterruptedException {
        URL url = Sonido.class.getResource("back.wav");
        AudioClip clip = Applet.newAudioClip(url);
        AudioClip clip2 = Applet.newAudioClip(url);
        clip.play();
        Thread.sleep(1000);
        clip2.loop();
        Thread.sleep(20000);
        clip2.stop();
        
        System.out.println("End");
    }

}
