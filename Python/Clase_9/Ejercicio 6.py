"""
Ejercicio 6: Ingresa N enteros, visualizar la suma de los números pares de la lista,
cuantos números pares existen y cuál es el promedio de los números impares
"""

N = int(input("¿Cuantos números desea ingresar?: "))

suma_pares = 0
cantidad_pares=0
suma_impares = 0
cantidad_impares = 0

for i in range(N):
    num = int(input(f"Introduce un numero {i+1}: "))

    if num % 2 == 0:
        suma_pares += num
        cantidad_pares += 1
    else:
        suma_impares += num
        cantidad_impares += 1

if cantidad_impares > 0:
    promedio_impares = suma_impares / cantidad_impares
else:
    promedio_impares = 0

print(f"\nResultados")
print(f"Suma de los números pares: {suma_pares}")
print(f"Cantidad de números pares: {cantidad_pares}")
print(f"Promedio de los números impares: {promedio_impares}")