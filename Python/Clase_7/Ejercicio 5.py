"""
Ejercicio 5: Sistema de calificaciones
El objetico del programa sera crear un sistema de calificaciones de la siguiente manera:
Le pediremos al usuario que ingrese un valor del 0 a 10
    Luego si ingreso 9 o 10 imprimimos A
    Luego si ingreso 8 o 9 imprimimos B
    Luego si ingreso 7 o 8 imprimimos C
    Luego si ingreso 6 o 7 imprimimos D
    Entre 0 y menor a 6 imprimimos F
    De lo contrario el valor ingresado es Incorrecto
"""
nota = int(input("Ingrese su nota: "))

if  9 <= nota <= 10:
    print("A")
elif  8 <= nota <= 9:
    print("B")
elif  7 <= nota <= 8:
    print("C")
elif  6 <= nota <= 7:
    print("D")
elif  0 <= nota <= 6:
    print("F")
else:
    print("El valor ingresado es Incorrecto")