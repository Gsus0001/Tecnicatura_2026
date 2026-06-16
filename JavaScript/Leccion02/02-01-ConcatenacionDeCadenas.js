var nombre = "Jesus";
var apellido = " Perez";
var nombreCompleto = nombre + " " + apellido; //Primera concatenacion de cadenas
console.log(nombreCompleto); 
var nombreCompleto2 = "Perez" + " " + "Laura";//Segunda concatenacion de cadenas
console.log(nombreCompleto2);
var junto = nombre + 219;//Lee de izq a der siguiendo la cadena leer el numero como Str
console.log(junto);
junto = nombre + 18 + 4;// Aqui se puede diferenciar a traves de los parentesis
console.log(junto);
junto = 18 + 4 + nombre;
console.log(junto);

nombre += apellido;//Tercera concatenacion de cadenas
console.log(nombre);

//Hoy ya no se usa var, se usa let o const
let nombre2 = "Ana";
console.log(nombre2);

const apellido2 = "Gomez";
//apellido2 = "Gomez"; una constante no se puede modificar
console.log(apellido2);

let x, y;//Se pueden declarar varias variables en una sola linea
x = 17, y = 21;//se pueden asignar valores a varias variables en una sola linea
let z = x + y;//Se pueden usar las variables declaradas para asignar un valor a otra variable
console.log(z);

let _1num = 10;
let $break = "Hola";//No utilizar palabras reservadas para nombrar variables, aunque se pueden usar caracteres especiales como _ y $

console.log($break);
console.log(_1num);

//Hoy ya no se usa var, se usa let o const
nombre = "Maria";
console.log(nombre);

const apellido3 = "Gomez";
//apellido3 = "Gomez"; //una constante no se puede modificar
console.log(apellido3);
 