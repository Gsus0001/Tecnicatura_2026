
package Ejercicio_4;

import java.util.Scanner;

/*
Determina si un alimno aprueba o repureba un curso, sabiendo que 
aprobara si su promedio de tres calificaciones es mayor o igual a 70 reprueba caso controario
*/
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la primera calificacion (0-100): ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite la segunda calificacion (0-100): ");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite la tercera calificacion (0-100): ");
        double nota3 = entrada.nextDouble();
        System.out.println();
                
        double promedio = (nota1+nota2+nota3)/3;
        
        System.out.println("Su promedio es de: "+promedio);
                
        if (promedio >= 70){
            System.out.println("Aprueba");
        }
        else{
            System.out.println("Desaprueba");
        }
    }
   
}
