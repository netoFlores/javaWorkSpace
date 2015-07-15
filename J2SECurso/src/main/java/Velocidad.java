
public class Velocidad {

    public static void main(String[] args) {
        Long inicio = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            System.out.println(i);
        }
        Long fin = System.nanoTime();
        
        Long inicio2  = System.nanoTime();
        int e = 0;
        while (e < 1000){
            System.out.println(e);
            e++;
        }
        Long fin2 = System.nanoTime();
        System.out.println("Ciclo For: " + (fin - inicio));
        System.out.println("Ciclo While " + (fin2-inicio2));
    }
}
