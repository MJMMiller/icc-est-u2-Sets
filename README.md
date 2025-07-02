# Práctica de Uso de Colecciones Set en Java

## 📌 Información General

- **Título:** Práctica de Uso de HashSet, LinkedHashSet, TreeSet y Comparadores Personalizados
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Miller Mendez Mateo Josue
- **Fecha:** 02 / 07 / 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto en Java implementa y demuestra el funcionamiento de las principales colecciones `Set`:  
HashSet, LinkedHashSet y TreeSet, incluyendo el uso de comparadores personalizados.

Además, se agregan ejemplos de manejo de objetos personalizados (Contactos) y su ordenación usando diferentes estrategias de comparación.

Incluye:

- 🔗 **HashSet:** Almacena elementos únicos sin garantizar orden.
- 🔗 **LinkedHashSet:** Almacena elementos únicos respetando el orden de inserción.
- 🔗 **TreeSet:** Almacena elementos únicos de forma ordenada (natural o personalizada con Comparator).
- 🔗 **Comparadores personalizados:** Ejemplos de orden por longitud y orden invertido para cadenas, y ordenamientos complejos para objetos `Contacto` (por apellido, nombre y teléfono).
- 👤 **Contactos:** Ejemplo de uso de TreeSet para ordenar objetos personalizados con distintos criterios.

---

## 🧪 Estructura

- `controllers/Sets.java`: Métodos para construir y mostrar ejemplos de HashSet, LinkedHashSet y TreeSet (con y sin Comparator).
- `controllers/ContactoController.java`: Controlador para mostrar el uso de TreeSet con objetos `Contacto` y comparadores personalizados.
- `utils/ContactoComparator.java`: Comparador que ordena contactos por apellido y nombre.
- `utils/ContactoComparatorConNumero.java`: Comparador que ordena contactos por apellido, nombre y teléfono (teléfono en orden descendente).
- `models/Contacto.java`: Clase para representar contactos (nombre, apellido, teléfono) con métodos equals, hashCode y toString.
- `App.java`: Punto de entrada que ejecuta los ejemplos y muestra resultados en consola.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Salida

```
Nombre: Mateo Miller

-- Hash Set --------------------------------------
Elementos del HashSet (No se garantiza orden):
Laptop
Pera
Celular
Manzana

-- LinkedHashSet --------------------------------------
Elementos del LinkedHashSet (respeta orden de insercion):
Laptop
Manzana
Pera
Celular

-- TreeSet --------------------------------------
Elementos del TreeSet (orden alfabetico):
Celular
Laptop
Manzana
Pera

-- TreeSet con Comparador --------------------------------------
Elementos del TreeSet con Comparador - Longitud & Alfabeticamente:
Pera
Laptop
Celular
Celulas
Manzana

-- TreeSet con Comparador Invertido --------------------------------------
Elementos del TreeSet con Comparador - Longitud & Alfabeticamente Invertido:
Manzana
Celulas
Celular
Laptop
Pera

Contactos orden alfabetico (apellido - nombre):
Pedro Gonzales - 123456789
Pedro Lopez - 222222222
Ana Perez - 987654321
Luis Perez - 111111111

Contactos orden alfabetico (apellido - nombre - telefono(des) ):
Pedro Gonzales - 123456789
Pedro Lopez - 222222222
Pedro Lopez - 123456789
Ana Perez - 987654321
Luis Perez - 111111111
```

---