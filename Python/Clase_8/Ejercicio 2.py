#Clacular la suma de "N" primeros numeros

n = int(input("Digite la cantidad de numeros a sumarse: "))

contador = 1
suma = 0

while contador <= n :
    suma = suma + contador
    contador = contador + 1

print(f"\n La Suma de los primeros {n} numeros es: {suma}")

