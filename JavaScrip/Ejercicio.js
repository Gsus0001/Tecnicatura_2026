// Ejercicio: Meses del año con switch, deben simplificar y agregar eficacia con el concepto

//       		  Dry don't repeat yourself: Evitar repetir tu código

//		  Crear una función como la de getDay para los meses del año

let monthNames = [
  'Enero', 'Febrero', 'Marzo', 'Abril',
  'Mayo', 'Junio', 'Julio', 'Agosto',
  'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'
];
function getMonth(monthNumber) {
  if (monthNumber < 1 || monthNumber > 12) {
    throw new Error('Número de mes inválido. Debe estar entre 1 y 12.');
  }
return monthNames[monthNumber - 1];
}

// Ejemplos de uso:
console.log(getMonth(12));// Output: Diciembre
console.log(getMonth(6));
console.log(getMonth(13)); // Esto lanzará un error
