
package Ejercicio_5;

import java.util.Scanner;

/**
 En un almacen se hacen un 20 % de descuento a los clientes cuya compra supere
 los $100 ¿Cual sera la cantidad que pagara una persona por su compra?
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el total de la compra: ");
        double compra = entrada.nextDouble();
        
        double totalPagar;
        
        if (compra >= 100){
            totalPagar = compra - (compra * 0.20);
            System.out.println("Se aplico un descuento del 20% sobre el total");
        }
        else{
            totalPagar = compra;
            System.out.println("No se le aplico descuento");
        }
        System.out.println("Total a pagar: $" + totalPagar);
        
        entrada.close();
    }
    
}
