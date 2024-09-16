# Getters y Setters en Java

## 🚀 Descripción

Este proyecto explora el uso de **getters** y **setters** en Java, uno de los principios fundamentales del **encapsulamiento** en la programación orientada a objetos (POO). Los getters y setters permiten controlar el acceso y la modificación de los atributos privados de una clase, proporcionando una capa de seguridad y flexibilidad en el manejo de los datos.

## 🔒 Encapsulamiento

El encapsulamiento es una de las cuatro características esenciales de la POO. Consiste en ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos públicos. En este caso, los getters y setters actúan como puertas de acceso para trabajar con los atributos privados.

**Ventajas:**

- Mantienen la **integridad** de los datos mediante la validación de entradas.
- Aseguran que los atributos privados no sean accedidos directamente desde fuera de la clase.
- Ofrecen la posibilidad de modificar la implementación interna sin afectar el código externo que usa la clase.

## 🔧 Getters

Un **getter** es un método público que permite acceder a los valores de los atributos privados de una clase. Generalmente, su nombre sigue la convención `getNombreDelAtributo()`, lo que facilita la lectura y uso del código.

**Características:**

- Proporciona acceso **controlado** a los atributos privados.
- Permite que la clase sea **inmutable** si no se implementan setters.

## 🛠️ Setters

Un **setter** es un método público que permite modificar el valor de un atributo privado. Estos métodos a menudo incluyen lógica de **validación** para asegurar que los datos que se asignan sean correctos.

**Características:**

- Protege contra valores inválidos o no deseados.
- Facilita la **mutabilidad** de los objetos, permitiendo modificar sus valores luego de la creación.

## ✨ Beneficios de Usar Getters y Setters

1. **Control total** sobre cómo los atributos son accedidos y modificados.
2. **Validación incorporada**, evitando que se asignen valores inapropiados.
3. Posibilidad de **ajustar el comportamiento interno** sin afectar la interfaz pública.
4. Mejoran la **legibilidad** y el **mantenimiento** del código.
5. Promueven el **principio de responsabilidad única**, asegurando que cada método tiene un único propósito.


## 🎯 ¿Por Qué Usar Getters y Setters?

El uso de getters y setters en Java no es solo una cuestión de estilo, sino una **práctica recomendada** para garantizar que tu código sea seguro, mantenible y escalable. Permiten que tu clase sea flexible a futuros cambios sin alterar la funcionalidad externa.





