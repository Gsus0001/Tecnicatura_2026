//Ejercicio 1: Calcular estacion del año
let mes = 12;

switch (mes) {
    case 12: case 1: case 2:
        console.log('Es verano');
        break;

    case 3: case 4: case 5:
        console.log('Es otoño');
        break;

    case 6: case 7: case 8:
        console.log('Es invierno');
        break;

    case 9: case 10: case 11:
        console.log('Es primavera');
        break;

    default:
        console.log('Mes no valido');
}
//Ejercicio como lo muestra el profesor
let mes2 = 4;
let estacion;//Undeafined

if (mes2 == 12 || mes2 == 1 || mes2 == 2) {
    estacion = 'Verano';

} else if (mes2 == 3 || mes2 == 4 || mes2 == 5) {
    estacion = 'Otoño';

} else if (mes2 == 6 || mes2 == 7 || mes2 == 8) {
    estacion = 'Invierno';
    
} else if (mes2 == 9 || mes2 == 10 || mes2 == 11) {
    estacion = 'Primavera';

} else {
    estacion = 'Valor incorrecto';

}
console.log('La estación es: ' + estacion);
//-------------------------------------------------------------------
//Ejercicio 2: Hora del dia
let hora = 15;

if (hora >= 6 && hora < 12) {
    console.log('Buenos dias');

} else if (hora >= 12 && hora < 18) {
    console.log('Buenas tardes');

}
else if (hora >= 18 && hora < 24) {
    console.log('Buenas noches');

}
else if (hora >= 0 && hora < 6) {
    console.log('Buenas noches');

} else {
    console.log('Hora no valida');

}

//--------------------------------------------------------------------
//Evitar repetir tu codigo
//Dri don´t repeat yourself

let days = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"]

switch (days){
    case "Lunes":
        console.log("Hoy es: "+days)
        break;

    case "Martes":
        console.log("Hoy es: "+days)
        break;

    case "Miercoles":
        console.log("Hoy es: "+days)
        break;

    case "Jueves":
        console.log("Hoy es: "+days)
        break;

    case "Viernes":
        console.log("Hoy es: "+days)
        break;

    case "Sabado":
        console.log("Hoy es: "+days)
        break;

    case "Domingo":
        console.log("Hoy es: "+days)
        break;
    default:
        break;    
}

//Opcion mejorada
let days2 = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];

function getDay(n){
    if(n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days2 [n-1];
}

console.log(getDay(5));

    




