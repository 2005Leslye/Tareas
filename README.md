# Lista de Tareas en Java 📝

Este proyecto es una aplicación de consola en Java para gestionar una lista de tareas. Permite al usuario agregar, leer y visualizar tareas guardadas en un archivo de texto. La aplicación es sencilla y útil para practicar el manejo de archivos, la entrada de usuario y el control de flujo en Java.

---

## 🚀 Características

- **Agregar Tareas:** Los usuarios pueden escribir tareas que se guardarán en un archivo de texto (`tareas.txt`) sin sobrescribir el contenido existente.
- **Leer Tareas:** El contenido de todas las tareas guardadas hasta el momento se puede mostrar en pantalla.
- **Salir del Programa:** Los usuarios pueden elegir terminar la ejecución en cualquier momento.

---

## 🤖 Detalles Técnicos

- **Clase Principal:** 
 
 Main.java
Manejo de Archivos: El archivo tareas.txt se abre en modo "append", de modo que se conservan las tareas anteriores y no se sobrescriben al agregar nuevas.
Excepciones: La aplicación incluye manejo básico de excepciones para gestionar posibles errores en la lectura y escritura del archivo.

