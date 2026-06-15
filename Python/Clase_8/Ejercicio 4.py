"""Suponga que se tiene un conjunto de calificaciones de un
grupo de 10 alumnos. Realizar un algoritmo para calcular la calificacion promedio
y la calificaion mas bajas de todo el grupo
"""
suma = 0
calificacion_baja = 100

for i in range(10):
    nota = float(input(f"Ingrese la calificación (1 a 100) {i+1}: "))
    suma = suma + nota

    if nota < calificacion_baja:
        calificacion_baja = nota
promedio = suma / 10

print(f"\nEl promedio es: {promedio}")
print(f"\nLa calificación mas baja es: {calificacion_baja}")