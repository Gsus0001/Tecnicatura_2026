#Diseñar un programa que ingresado un año, nos devuelva por consola si es un año bisiesto o no, repetir
#la accion hasta que el usuario lo desida
from pydoc import resolve
from traceback import print_tb

repetir = "s"
while True:

    print("Comprobamos si el año es Bisiesto")
    num = int(input("Ingrese el Año: "))

    if (num % 4 == 0 and num % 100 != 0) or (num % 400 == 0):
        print("Es Bisiesto")
    else:
        print("No es Bisiesto")
    print()
    repetir = input("Desea seguir comprobando? (s/n): ")
    if repetir.lower() == "s":
        continue
    break
