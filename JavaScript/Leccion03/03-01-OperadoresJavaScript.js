//Ejercicio: para encontrar numeros pares e impares
let numero = 7;

if (numero % 2 === 0) {
    console.log('El numero es par');
}else {
    console.log('El numero es impar');
}

//-------------------------------------------------------------------

//Ejercicio: es mayor de edad

let edad = 10;

if (edad >= 18) {
    console.log('Eres mayor de edad');

}else {
    console.log('Eres menor de edad');
}   

//-------------------------------------------------------------------
//Ejercicio: Dentro de un rango
let dentroRango = 11;
let min = 0, max = 10;

if (dentroRango >= min && dentroRango <= max) {
    console.log('El numero esta dentro del rango');

} else {
    console.log('El numero esta fuera del rango');
}
//-------------------------------------------------------------------
//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;


if (vacaciones || diaDescanso) {
    console.log('El padre puede asistir al juego de su hijo');
} else {
    console.log('El padre no puede asistir al juego de su hijo');
}

//Operador Ternario
let resultado = 3 > 2 ? 'Verdadero' : 'Falso';
console.log(resultado);

let numero3 = 12;
resultado2 = numero3 % 2 === 0 ? 'El numero es par' : 'El numero es impar';
console.log(resultado2);

//-------------------------------------------------------------------

//Convertir String a numero
let miNumero = "10";//Es una cadera
console.log(typeof miNumero); // Output: string

let edad2 = Number(miNumero); // Convertir a número
console.log(typeof edad2); // Output: number

//Funcion isNaN() para verificar si el valor es un numero o no

if (isNaN(edad2)) {//No es un numero 
    console.log('No es un numero valido');
} else if (edad2 >= 18) {
    console.log('Puedes votar');
} else {
    console.log('Eres muy joven para votar');
}

//Operador Ternario

let resultado3 = edad2 >= 18 ? 'Eres mayor de edad' : 'Eres menor de edad';
console.log(resultado3);

//-------------------------------------------------------------------

//Ampliando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento, este forma parte del ambito global
Un error es que se sobreescriba
*/

var nombre = 'Jesus';
nombre = 'Osvaldo'; // Reasignación permitida con var
console.log(nombre); // Output: Osvaldo

function saludar() {
    var saludo3 = 'Natalia';
    console.log(saludo3); // Output: Natalia
}
//console.log(nombre3); // Aqui no lee el dato de la funcion

if (true) {
    var edad = 34;
    console.log(edad); // Output: 34
}
console.log(edad); // En la función funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento,
la diferencia es que en su ambito es de bloque,
o dentro de una funcion
*/

function saludar2() {
    let nombre = 'Natalia';
    console.log(nombre); // Output: Natalia
}
console.log(nombre); // Output: Osvaldo

if (true) {
    let edad2 = 34;
    console.log(edad2); // Output: 34

}

/*
const: se utiliza para valores constantes, que no se pueden reasignar
*/

const fechaNacimiento = '06-07-2004';
console.log(fechaNacimiento); // Output: 06-07-2004
//fechaNacimiento = '07-08-2005'; // Esto lanzará un error, no se puede reasignar una constante
//console.log(fechaNacimiento); // Esto no se ejecutará debido al error anterior







