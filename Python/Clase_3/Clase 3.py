#Tipos de Datos
a = 10 #Int
print(a)
print(type(a))
a = True #Bool
print(a)
print(type(a))
a = False #Bool
print(a)
print(type(a))
a = "Hola a Todos" #Str
print(a)
print(type(a))
a = 3.14 #Float
print(a)
print(type(a))

#Manejo de Cadena
miGrupoFavorito = "Imagine Dragons: "
caracteristicas = "Enemy es una de mis cansiones favoritas"
print("Mi grupo favorito es: "+miGrupoFavorito+caracteristicas)

print("Mi grupo favorito es:", miGrupoFavorito, caracteristicas)#Segunda forma de concatenate

numero1 = "7"
numero2 = "8"
print(numero1 + numero2) #Concatena las cadenas, no suma los números
print(int(numero1) + int(numero2)) #Convierte las cadenas a enteros y luego los suma, Solo se pueden sumar dos cadenas siempre y cuando los datos sean números

#Tipos de Datos Boleanos (Bool)
mibooleano = 1 > 2 
print(mibooleano)

if mibooleano:
    print("El Resultado es verdadero")
else:
    print("El Resultado es falso")

#Procesar entrada del usuario
#Función input
resutaldo = input("Digite un numero: ") #La function input siempre devuelve un string
print(resutaldo)

#Conversión de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)


