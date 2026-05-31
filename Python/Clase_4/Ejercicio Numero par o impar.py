# Solicitamos al usuario ingresé un número:
#Este se asigna a una variable
#Utilizaremos la estructura "If else"
#La formula: <num>%2 == 0 Esta operacion nos dice si es un numero par
#Si es True imprimimos que es par
#Si es False imprimimos que es impar

num = int(input("Ingrese un numero: "))
print(f"El residuo de la division es: {num % 2}")
if num % 2 == 0:
    print(f"El valor del num es: {num} es un Numero Par")
else:
    print(f"El valor de num es: {num} es un Numero Impar")