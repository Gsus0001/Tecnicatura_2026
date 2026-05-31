#En el siguiente ejercicio se solicita calcular el área y perimetro de un rectángulo
#Para ello debemos de crear las siguientes variables:
#alto (int)
#ancho (int)
#El usuario debe proporcionar los valores de alto y ancho, después se debe imprimir el resultado en el siguiente formato
#Proporciona el alto del rectángulo: 5
#Proporciona el ancho del rectángulo: 3
#El área del rectángulo es: 15
#El perímetro del rectángulo es: 16
#Las formulas para calcular el área y perimetro de un rectángulo son:
#área = alto * ancho
#perimetro = 2 * (alto + ancho)

alto = int(input("Proporciona el alto del rectángulo: "))
ancho = int(input("Proporciona el ancho del rectángulo: "))
area = alto * ancho
perimetro =(alto + ancho) * 2
print(f"El area del rectángulo es: {area}")
print(f"El perimetro del rectángulo es: {perimetro}")
