# Pedimos al usuario un valor numérico
# Verificamos si el valor ingresado se encuentra entre el rango de 0 a 5
# La formula es: <num> >= and <num><=5

valor = int(input("Ingrese un numero entre 0 a 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} esta fuera del rango")