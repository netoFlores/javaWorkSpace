package games;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Movimiento extends JPanel {
    int x = 0;
    int y = 0;
    
    private void moveBall(){
        x += 1;
        y += 1;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Mini Juego");
        Movimiento game = new Movimiento();
        frame.add(game);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}
