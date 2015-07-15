
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neto
 */
public class Prueba {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El numero mayo de " + a + ", " + b + " es: " + prueba.numeroMayor(a,b));
        System.out.println("El numero mayo de 6, 9, 12 es: " + prueba.numeroMayor(6, 9, 12));
    }
    
    Integer numeroMayor(Integer a, Integer b){
        return a>b?a:b;
    }
    Integer numeroMayor(Integer a, Integer b, Integer c){
        int numero = 0;
        numero = a>b?a:b;
        return c>numero?c:numero;
    }
}
