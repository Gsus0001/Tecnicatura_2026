
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Rectangulo
        
        Se solicita calcular el área y el perímetro de un rectángulo, para esto deberemos crear las variables:
        Alto (int)
        Ancho(int)
        El usuario debe proporcionar los valores de alto, ancho y después se debe imprimir el resultado en el siguiente formato: (recuerden no usar acentos, respetar los espacios, mayúsculas, minúsculas y saltos de líneas.
 
         */
        var entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la base del Rentangulo");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo");
        double altura = entrada.nextDouble();
        
        double area = base * altura;
        double perimetro = 2* (base + altura);
        
        System.out.println("Area: "+area);
        System.out.println("Perimetro: " + perimetro);
        
        
        
        
    }

}
