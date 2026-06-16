//Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/
var nombre = "Jesus"; //Tipo String
console.log(typeof nombre);
nombre = 7;
console.log(nombre);
nombre = 12.3;
console.log(typeof nombre);

var numero = 3000; //Tipo Number
console.log(typeof numero);

var objeto = {
    nombre: "Jesus",
    apellido: "Perez",
    telefono: "1234567890"
}; //Tipo Object

console.log(objeto);

//Tipo Boolean
var bandera = true;
console.log(bandera);
bandera = false;
console.log(bandera);

//Tipo de dato function
function miFuncion() {}
console.log(miFuncion);

//Tipo de dato Symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        }

}
console.log(Persona);

//Tipo de dato undefined
var x = undefined;
console.log(typeof x);

x = undefined;
console.log(typeof x);

// null:significa ausencia de valor
var y = null;
console.log(typeof y); //En JavaScript, el tipo de null es "object", lo cual es un error histórico pero se mantiene por compatibilidad.

//Tipo de dato array y Empty String
var autos = ["BMW", "Audi", "Volvo"]; //Tipo Array
console.log(autos);
console.log(typeof autos); //En JavaScript, el tipo de un array es "object".

var z = ""; //Empty String
console.log(z);
console.log(typeof z);


