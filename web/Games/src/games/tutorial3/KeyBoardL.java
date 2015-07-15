package games.tutorial3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyBoardL extends JPanel{
    
    public KeyBoardL(){
        KeyListener listener = new MykeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini tennis");
        KeyBoardL keyboadL = new KeyBoardL();
        frame.add(keyboadL);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public class MykeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("KeyPressed=" + KeyEvent.getKeyText(e.getKeyCode()));
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased=" + KeyEvent.getKeyText(e.getKeyCode()));
        }
        
    }
}
