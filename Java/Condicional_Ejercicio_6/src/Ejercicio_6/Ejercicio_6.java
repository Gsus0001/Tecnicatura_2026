
package Ejercicio_6;

import java.util.Scanner;

/*
 Leer 2 numeros; si son iguales, que los multiplique, si el primero es mayor que el segundo que lo reste y si no que los sume
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite dos numeros: ");
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        
        double resultado;
        
        if (num1 == num2){
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        }
        else if (num1 > num2){
            resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
        }
        else{
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}
