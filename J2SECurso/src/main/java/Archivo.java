
import java.io.File;


public class Archivo {

    public static void main(String[] args) {
        File archivo = new File("\\home\\neto\\ejemplo");
        boolean  respuesta = archivo.delete();//archivo.mkdir() para crear carpetas.
        
        System.out.println(respuesta);
    }
}
