# Preguntar la edad al usuario
# Si la edad está dentro de los 20 o 30 años, está dentro del rango
# Combinamos los operadores and y or para saber si el usuario está dentro del rango o no

edad = int(input("Ingrese su edad: "))
# veinte = edad >= 20 and edad < 30
# print(veinte)
# treinta = edad >= 30 and edad < 40
# print(treinta)

# Sintaxis simplificada del operador and
#if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40):
    print("Estas dentro del rango de los (20\"0) a (30\"0) años")
    #if veinte:
        #print("Estas dentro del rango de los (20\"0) años")
    #elif treinta:
        #print("Estas dentro del rango de los (30\"0) años")
    #else:
        #print("No estas dentro del rango")
else:
    print("No estas dentro del rango de los (20\"0) a (30\"0) años")


