#Pedir un numero al usuario
#Almacenar el valor en una variable
#Usar la estructura "If Else"
#La formula es: <num> >= 18
#True: Es mayor de edad, Imprimir
#False: Eres menor de edad, Imprimir
#Como la hice yo
edad = int(input("Ingrese su edad: "))
if edad >= 18:
    print(f"La edad ingresada es: {edad} es mayor de edad")
else:
    print(f"La edad ingresada es: {edad} es menor de edad")

#------------------------
#Otra forma como muestra el profe
edadAdulto = 18
edadPersona = int(input("Ingrese su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} es menor de edad")
