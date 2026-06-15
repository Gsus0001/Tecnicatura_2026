#Calcula el factoriual de un numero mayor o igual a 0

num = int(input("Digite un numero: "))

if num >= 0:
    i = 1
    fac = 1

    while i <= num:
        fac = fac * i
        i = i + 1
    print(f"El factorial de {num} es: {fac}")

else:
    print("Error: El numero debe ser mayor o igual a 0.")
