# Escribir las siguientes expresiones en forma de expresión algorítmica
# A3 x (b2 - 2ac) / 2b
# Pedimos al usuario 3 valores = a, b, c
# Mostramos el resultado final
a = float(input("Introduce un numero para a: "))
b = float(input("Introduce un numero para b: "))
c = float(input("Introduce un numero para c: "))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f"El resultado es: {resultado}")