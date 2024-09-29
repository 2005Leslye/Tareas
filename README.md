# 🏥 Sistema de Gestión Hospitalaria - Tarea 12

¡Bienvenido a la **Tarea 12** del Sistema de Gestión Hospitalaria! En esta versión, el enfoque está en la **seguridad de los datos** y **validaciones críticas** para mejorar la integridad del sistema. Hemos implementado nuevas reglas para garantizar que no haya duplicidad en los registros y que solo trabajemos con datos válidos.

## 🚀 Novedades en esta versión

### 🔍 Validación de Pacientes y Médicos
- Al momento de registrar una nueva consulta, el sistema realiza una validación exhaustiva para asegurarse de que tanto el **paciente** como el **médico** ya existan en la base de datos.
- Si alguno de ellos no está registrado, ¡no te preocupes! El sistema no permitirá que avances hasta que ambos estén correctamente registrados.

### 📞 Prevención de Números de Teléfono Duplicados
- Evitamos confusiones al asegurar que cada número de teléfono sea **único**.
- Si intentas registrar un paciente o médico con un número de teléfono que ya existe en el sistema, recibirás una alerta de inmediato. ¡Adiós a los números duplicados!



