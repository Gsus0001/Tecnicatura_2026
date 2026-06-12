import java.util.Scanner;

public class Ejercicio2_Clase10 {
    public static void main(String[] args) { 
       /* Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow
 */
         var entrada = new Scanner(System.in);
         
         System.out.println("Ingrese el valor de a");
         double a = entrada.nextDouble();
         System.out.println("Ingrese el valor de b");
         double b = entrada.nextDouble();
         
         double resultado = Math.pow(a+b, 2);
         
         System.out.println("El resultado es: " + resultado);
         
         entrada.close();
                  
    }
}   
/*
Datos extraidos como curiosidad
Valores especiales
Math.pow(2, -3);     // 0.125 (1/8)
Math.pow(16, 0.5);   // 4.0 (raíz cuadrada)
Math.pow(27, 1.0/3); // 3.0 (raíz cúbica)
Math.pow(2, 1024);   // Infinity (demasiado grande para double)
Math.pow(2, -1074);  // Menor número positivo subnormal
*/