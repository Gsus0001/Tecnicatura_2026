"""
Ejercicio 7: Dadas las horas trabajadas de 5 personas y las tarifas
de pago, calcular el salario, y la sumatoria de todos los salarios
"""

suma = 0

for i in range(5):
    print(f"Empleado {i+1}")
    horas = int(input("Ingrese la horas trabajadas: "))
    tarifa = int(input("Ingrese la tarifa por hora: $ "))
    print()

    salario = horas * tarifa

    print(f"El salario es: ${salario}")
    print()

    suma = suma + salario

print()
print(f"La suma de todos los salarios es: {suma}")
