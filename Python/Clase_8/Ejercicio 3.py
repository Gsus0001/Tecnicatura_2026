#Leer 10 números e imprimir cuantos son positivos, cuantos negativos
#y cuantos neutros

positivo = 0
negativo = 0
neutros = 0

for i in range(10):

    num = int(input(f"Digite un número {i+1}: "))
    if num > 0:
        positivo = positivo + 1
    elif num < 0:
        negativo = negativo + 1
    else:
        neutros = neutros + 1
print()
print("Resultados:" )
print(f"Números Positivo: {positivo}")
print(f"Números Negativo: {negativo}")
print(f"Números Neutros: {neutros}")
