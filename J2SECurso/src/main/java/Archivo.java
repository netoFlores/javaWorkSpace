
import java.io.File;
import javax.swing.JOptionPane;


public class Archivo {

    public static void main(String[] args) {
        File archivo = new File("\\home\\neto\\ejemplo");
        boolean  respuesta = archivo.delete();//archivo.mkdir() para crear carpetas.
        JOptionPane.showMessageDialog(null, "Hola mundo");
        System.out.println(respuesta);
    }
}
