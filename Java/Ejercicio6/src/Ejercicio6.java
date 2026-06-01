
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.print("Ingresa la cantidad de Dolares de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());
        
        luis = guillermo /2;
        juan = (luis + guillermo) /2;
        total = luis + guillermo + juan;
        
        System.out.println("\n El dinero de Luis es: "+luis+"$");
        System.out.println("\n El dinero de Juan es: "+juan+"$");
        System.out.println("\n El total de dolares entre los tres es: "+total+"$");
    }
}
