# Mostrar: Ingrese los sigueinte datos del Libro
# Digite el nombre del libro
# Digite el Id del libro
# Digite el precio del libro
# Indicar si el envio es gratuito (True/False)
# Mostrar:
    #Nombre:
    #ID:
    #Precio
    #Envio Gratuito:




print("Ingrese los siguiente datos del libro:")
nombre = input("Ingrese el nombre del libro: ")
id =  int(input("Ingrese el id del libro: "))
precio = float(input("Ingrese el precio del libro: $ "))
envio = bool(input("Ingrese si el envio del libro es Gratuito (True/False): "))

print("\n")

print("El nombre del libro es: ", nombre)
print("El ID del libro es: ", id)
print("El precio del libro es: $ ", precio)
print("El envio es gratis?: ", envio)
print("\n")
print("\n")

#-------------------------
# Como muestra el profe el ejercicio
print("Digite los siguientes datos del libro:")
nombre = input("Ingrese el nombre del libro: ")
id = int(input("Ingrese el id del libro: "))
precio = float(input("Ingrese el precio del libro: "))
envioGratuito = input("Ingrese si el envio del libro es Gratuito (True/False): ")

if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True o False"
print(f"""
      Nombre: {nombre}
      ID: {id}
      Precio: {precio}
      Envio Gratuito?: {envioGratuito}
      """)
