"""
#Operadores Aritméticos
#Suma +
#Resta -
#Multiplicación *
#División /
#Divicion Entera //
#Módulo o Resto %
#Exponenciación **

operadorA = 8
operadorB = 5
suma = operadorA + operadorB
#print("La suma es: ", suma)
print(f"El resultado de la suma es: {suma}")#Incluir la variale en la cadena se le llama interpolación de cadenas {}

resta = operadorA - operadorB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operadorA * operadorB
print(f"El resultado de la multiplicación es: {multiplicacion}")

division = operadorA / operadorB
print(f"El resultado de la división es: {division}")

division_entera = operadorA // operadorB
print(f"El resultado de la división entera es: {division_entera}")

modulo = operadorA % operadorB
print(f"El resultado de la division o residuo (módulo) es: {modulo}")

exponenciacion = operadorA ** operadorB
print(f"El resultado de la exponenciación es: {exponenciacion}")
"""
"""
#-----------------------------------
# Operadores de asignacion
miVirarible3 = 10
print(miVirarible3)

# Operadores de reacignacion
miVirarible3 = miVirarible3 + 1
print(miVirarible3)

miVirarible3 += 1
print(miVirarible3)

# miVariable3 = miVariable3 - 2
miVirarible3 -= 2
print(miVirarible3)

#miVariable3 = miVariable3 * 3
miVirarible3 *= 3
print(miVirarible3)

#miVariable3 = miVariable3 / 2
miVirarible3 /= 2
print(miVirarible3)

#miVariable3 = miVariable3 // 2
miVirarible3 //= 2
print(miVirarible3)

#miVariable3 = miVariable3 ** 2
miVirarible3 **= 2
print(miVirarible3)

#miVariable3 = miVariable3 % 2
miVirarible3 %= 2
print(miVirarible3)
"""
#Operadores aritméticos en operaciones sobre cadenas de textos:
#Operadores de Comparación
# == Son iguales ´a´ == ´a´ -> True, 1 == 1 -> True, 2 == 1 -> False
# != Son distintos ´a´!= ´a´ -> False
# > Es mayor que 5 > 4 -> True
# < Es menor que 5 < 4 -> False
# >= Es mayor o igual que 4 >= 4 -> True
# <= Es menor o igual que 4 <= 4 -> True

d = 4
b = 2
resultado = (d == b)#Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = (d != b)
print(resultado)

# Operador mayor que
resultado = (d > b)
print(resultado)

#Operador menor que
resultado = (d < b)
print(resultado)

#Operador Mayor o igual que
resultado = (d >= b)
print(resultado)

#Operador Menor o igual que
resultado = (d <= b)
print(resultado)