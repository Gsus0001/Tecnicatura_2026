
import java.util.Scanner;

//Nuestro Primer porgrama Hola Mundo
/*
Dos formas de comentar 
 */
public class HolaMundo {

    public static void main(String args[]) {
        /*System.out.println("Hola mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en Programación";
        System.out.println(miVariableCadena);
         */
        //Var - inferencia de tipos en Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Sigamos Estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);/*
        //soutv + tab
        //Para ejecutar Ctrl+F6 el debug
        //Reglas para definir una variable Java
        /*
        var usuario = "Osvaldo";
        var titular = "Ingeniero";
        var union = titular +" "+ usuario;
        System.out.println("Union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + ( a + b));//De esta forma se genera un contexto
        
        //Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        System.out.println(nombre);
        System.out.println("\nNueva linea: \n" + nombre);//Diagonal inversa \ y letra n (Para la digonal inversa (Segun Tabla ASCII ALT + 92))
        System.out.println("Trabulador: \t"+nombre);//Tabulador un espacio para Centrar
        System.out.println("\t\t. :Menu:.");
        System.out.println("Retroseso: \b\b"+nombre);//Caracter de Retroseso
        System.out.println("Comillas simples: \'" + nombre + "\'");//Caracter de Comillas simples
        System.out.println("Comillas Dobles: \""+nombre+"\"");//Caracter de Comillas Dobles
         */

 /*
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su Nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
         */
 /*
        //Tipos Primitivos Enteros
        byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        System.out.println("\n");
        
        short numEnteroShort = (short)32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+Short.MAX_VALUE);
        System.out.println("\n");
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Short: "+Integer.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+Integer.MAX_VALUE);
        System.out.println("\n");
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor manimo del Long: "+Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: "+Long.MAX_VALUE);
         */
 /*
        //Tipos Primitvos Tipos Flotantes
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de Float: "+Float.MIN_VALUE);
        System.out.println("El valor maximo de Floar: "+Float.MAX_VALUE);
        System.out.println("\n");
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: "+Double.MIN_VALUE);
        System.out.println("El valor maximo de Double: "+Double.MAX_VALUE);
         */
 /*
        //Inferencia de tipo var y tipo primitivos
        var numEntero = 20;//Las literales sin punto automaticamente son tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;//Automaticamente con el punto decimal se transforma en tipo Double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
         */
 /*
        //Tipos Primitivos Char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        char varCaracter = '\u0024';//Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36;//Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaraterSimbolo = '$';//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaraterSimbolo = " + varCaraterSimbolo);
        System.out.println("\n");

        var varCaracter1 = '\u0024';//Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36;//Valor Entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaraterSimbolo1 = '$';//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaraterSimbolo1 = " + varCaraterSimbolo1);
        System.out.println("\n");
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'j';
        System.out.println("caracterChar = " + caracterChar);
         */
 
         /*
        //Tipos primitivos tipo Booleanos
        boolean varBool = false;
        System.out.println("varBool = " + varBool);

        if (varBool){
            System.out.println("La Bandera es Verde");
        }
        else{
            System.out.println("La Bandera es Roja");
        }
        
        //Algoritno: ¿Es mayor de edad?
        var edad = 18;
        //var adulto = edad >=18;
        if(edad >=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        */
         
         
//         //Conversion de tipo primitivos
//         var edad = Integer.parseInt("20");
//         System.out.println("edad = " + (edad+1));
//         var valorPI = Double.parseDouble("3.1416");
//         System.out.println("valorPI = " + valorPI);
//         
//         //Pedir un valor
//      var entrada = new Scanner(System.in);
//         System.out.println("Digite su edad");
//         edad = Integer.parseInt(entrada.nextLine());
//         System.out.println("Su edad es = " + edad);
         
         /*
         //Conversion de tipos primitivos en Java Parte 2
         var edadTexto = String.valueOf(10);
         System.out.println("edadTexto = " + edadTexto);
         
         var fraseChar = "Programadores".charAt(4);
         System.out.println("fraseChar = " + fraseChar);
         
         System.out.println("Digite un caracter: ");
         fraseChar = entrada.nextLine().charAt(0);
         System.out.println("fraseChar = " + fraseChar);
         */
         
         /*
         int num1 = 5, num2 = 4;
         var solucion = num1 + num2;
         System.out.println("solucion de la suma = " + solucion);
         
         solucion = num1 - num2;
         System.out.println("solucion de la resta = " + solucion);
         
         solucion = num1 * num2;
         System.out.println("solucion de la multiplicacion = "+ solucion);
         
         solucion = num1 / num2;
         System.out.println("solucion de la division= " + solucion);
         
         var solucion2 = 3.4/num2;
         System.out.println("solucion2 resultado de la division  = " + solucion2);
         
         solucion = num1 % num2;//Guarda el residuo entero de la division
         System.out.println("solucion = " + solucion);
         
         if(num2 % 2 == 0)
             System.out.println("Es un numero Par");
         else
             System.out.println("Es un numero Impar");
         */
         
         /*
         int varNum1 = 1, varNum2 = 4;
         int varNum3 = varNum1 + 6 - varNum2;//Una Operacion
         System.out.println("varNum3 = " + varNum3);
         
         varNum1 +=1;//Esto es lo mismo que varNum1 = varNum1 +1;
         System.out.println("varNum1 = " + varNum1);
         
         varNum2 -= 2;
         System.out.println("varNum2 = " + varNum2);
         
         varNum1 *= 5;
         System.out.println("varNum1 = " + varNum1);
         
         varNum3 /=4;
         System.out.println("varNum3 = " + varNum3);
         
         varNum1 %=6;
         System.out.println("varNum1 = " + varNum1);
       */
         
       /*
         //Operadores Unarios: Cambio de Signo
         var varA = 7;
         var varB = -varA;
         System.out.println("varA = " + varA);
         System.out.println("varB = " + varB);//El resultado sera un numero negativo
         
         //Operadores de Negacion
         var varC = true;//Esta literal por defail en Java es tipo boolean
         var varD = !varC;//Aqui esta invertido el valor
         System.out.println("varC = " + varC);
         System.out.println("varD = " + varD);
         
         //Operadores unarios de Incremento: Preincremento
         var varE = 9;//Se va a modificar su valor
         var varF = ++varE;//Simbolo antes de la variable
         //Primero se incrementa la variable y despues se una su valor                 
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        //Posincremento
        var varG = 3;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores unarios de Decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        //PosDecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        */
       
       /*
       //Operadores de igualdad y Relacionales
       var aNum = 5;
       var bNum = 4;
       var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
       var dNum = aNum !=bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
       
       //Operadores Relacionales
       var gVar = aNum >= bNum;//> >= <= == !=
       System.out.println("gVar = " + gVar);
       
       if (aNum % 2 == 0){
            System.out.println("El numero es Par");
       }
       else{
            System.out.println("El numero es Impar");
       }
       
       var edad = 30;
       var adulto = 18;
       if(edad >= adulto){
            System.out.println("Es mayor de edad");
       }
       else{
            System.out.println("Es menor de edad");
       }
        */
       /*
       //Operadores Condicionales
       var valorA = 0;
       var valorMinimo = 0;//Rango del 0 al 10
       var valorMaximo = 10;
       var respuesta = valorA >= 0 && valorA <= 10;
             
       if(respuesta == true){
           System.out.println("Esta dentro del rango establecido");
       }
       else{
            System.out.println("Esta fura del rango establecido");
       }
       
       var vacaciones = true;
       var diaLibre = false;
       
       if(vacaciones || diaLibre){
           System.out.println("Papa puede asistir al juego de su hijo");
       }
       else{
           System.out.println("Papa no puede asistir al juego de su hijo");
       }
       */
       /*
       //Operador Ternario
       var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
       System.out.println("resultadoT = " + resultadoT);
       
       var numeroT = 7;
       resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);
        */
       
       //Prioridad de los operadores
       var x =5;
       var y =10;
       var z = ++x + y--;
       System.out.println("x = " + x);//6
       System.out.println("y = " + y);//9
       System.out.println("z = " + z);//16
       
       var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);//14
        
       solucionAritmetica = (4+5) * 6/3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);//18
       
       
    }
}

