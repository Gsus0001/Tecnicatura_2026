package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Ingrese la primera Calificacion: ");
        int calificacion1 = entrada.nextInt();
        System.out.println("Ingrese la segunda Calificacion: ");
        int calificacion2 = entrada.nextInt();
        System.out.println("Ingrese la tercera Calificacion: ");
        int calificacion3 = entrada.nextInt();
        
        int suma = calificacion1 + calificacion2 + calificacion3;
        
        System.out.println("\nLa suma de las tres calificaciones es: "+suma);
    }

}
