import java.util.Scanner;
public class Ejercicio1 {
    /*
    Ejercicio 1: Detalles del libro
    1. Pregunta el nombre del libro
    2. Pregunta el autor del libro
    3. Muestra por consola la informacion: nombreLibro + "Fue Escrito por: "+nombre Autor
    4. Van a tener que utilizar la clase Scanner
    */
    public static void main(String args[]){
        var entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombreLibro1 = entrada.nextLine();
        System.out.println("Digite el id del Libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito '\'True/False'\': ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        System.out.println("\n");
        
        System.out.println(nombreLibro1+" #"+idLibro);
        System.out.println("Precio del Libro: $"+precioLibro);
        System.out.println("El envio del libro Gratuito es: "+envioGratuito);
        
             
    }
}
