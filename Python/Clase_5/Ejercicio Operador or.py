# La pregunta es si un padre puede asistir al juego de su hijo
# Verificamos si tiene vacaciones
# Verificamos si tiene el dia libre
# Usar estructura "If Else" con el operador or

vacaciones = False
diaDescanso = True
if not (vacaciones or diaDescanso):
    print(f"Puede asistir al juego")
else:
    print(f"Tiene trabajo que hacer")