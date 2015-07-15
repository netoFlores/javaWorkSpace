
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LeerArchivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        long incio = System.nanoTime();
        FileReader reader = new FileReader("/home/neto/--192.168.1.*.txt");
        BufferedReader buffer = new BufferedReader(reader);
        String texto;
        while ((texto = buffer.readLine()) != null) {
            System.out.println(texto);
        }
        long fin = System.nanoTime();
        double time = fin - incio;
        JOptionPane.showMessageDialog(null, time);
        
//        FileInputStream input = new FileInputStream("/home/neto/--192.168.1.*.txt");
//        Scanner s = new Scanner(input, "UTF-8");
//        String txt = s.toString();
//        System.out.println(txt);
        //JOptionPane.showMessageDialog(null, "Hola MUndo");
        
    }
}
