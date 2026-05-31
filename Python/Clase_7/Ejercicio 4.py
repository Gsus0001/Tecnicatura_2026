"""
Ejercicio 4: Etapas de Vida
    Haremos un programa que cuando el usuario ingrese su edad le diga, o imprima la etapa de su vida en una breve oración:
        0 a 10 = La infancia es increible y bella
        10 a 19 = Tenes muchos cambios, muchos que estudiar
        20 a 29 = Amor y comezar el trabajo
        Para las siguientes etapas, deberás completar
"""
edad = int(input("Ingrese su edad: "))
mensaje = None
if 0 <= edad <= 10:
    mensaje = "La infancia es increible y bella"
elif 10 <= edad <= 20:
    mensaje = "Tenes muchos cambios, muchos que estudiar"
elif 20 <= edad <= 29:
    mensaje = "Amor y comezar el trabajo"
elif 30 <= edad <= 39:
    mensaje = "Formar una familia y seguir esforsandose en el trabajo"
elif 40 <= edad <= 59:
    mensaje = "Contruir tu casa y ver el cresimiento de los niños"
elif 60 <= edad <= 69:
    mensaje = "El ultimo tramo antes de la Jubilacion"
elif 70 <= edad <= 79:
    mensaje = "Disfrutar la vida, disfrutar el retiro y apreciar los futuros nietos"
else:
    mensaje = "Error, etapa de vida no reconocida"
print(f"Tu edad es: {edad}, {mensaje}")
