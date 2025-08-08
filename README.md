# 🧪 Prueba Técnica - Desarrollador Java Junior

Este repositorio contiene la solución a los **puntos 1 y 2** del enunciado proporcionado en la prueba técnica para el cargo de **Desarrollador de Software Junior**. El proyecto está implementado en **Java puro**, utilizando buenas prácticas de **programación orientada a objetos (POO)**.

---

## 📁 Estructura del Proyecto

```
src/
├── app/
│   ├── PalindromeMain.java    # Punto 1: Main del ejercicio de palíndromo
│   └── PooMain.java           # Punto 2: Main del ejercicio POO
├── palindrome/
│   └── PalindromeBuilder.java # Lógica del algoritmo de palíndromo
├── poo/
│   ├── interfaces/            # Interfaces de los ejercicios POO
│   ├── model/                 # Clase Documento
│   └── implementation/        # Implementaciones de fuentes, salidas y buscador
```

---

## 🧠 Punto 1 – Algoritmo de Palíndromo

**Objetivo:**  
Determinar si es posible reordenar los caracteres de una cadena para formar un palíndromo. Si es posible, se construye y muestra uno válido. Si no, se imprime `"Not Possible"`.

**Clase principal:** `PalindromeBuilder`  
**Clase ejecutable:** `PalindromeMain`  
**Ubicación:** `src/palindrome/` y `src/app/`

**Ejemplo de uso:**
```bash
java app.PalindromeMain
```

---

## 🧱 Punto 2 – Programación Orientada a Objetos

**Objetivo:**  
Simular un sistema de crawling, procesamiento e indexación de documentos desde distintas fuentes de datos. El diseño sigue principios de POO como interfaces, polimorfismo y separación de responsabilidades.

**Componentes:**

- `Documento`: Clase que representa un documento.
- `FuenteDatos`: Interfaz para fuentes de datos simuladas.
- `Salida`: Interfaz para salidas del sistema.
- `Buscador`: Clase que simula la búsqueda de documentos.
- Implementaciones:
  - `FuenteArchivo`, `FuenteWeb`, `FuenteBaseDatos`
  - `SalidaSearchUI`, `SalidaDashboard`

**Clase ejecutable:** `PooMain`  
**Ubicación:** `src/poo/` y `src/app/`

**Ejemplo de uso:**
```bash
Ejercicio 1  -> java -cp out app.PalindromeMain
Ejercicio 2  -> java -cp out app.PooMain
```

---

## 🛠️ Compilación y Ejecución

Puedes compilar y ejecutar los programas desde la terminal con:

```bash
javac -d bin src/**/*.java
java -cp bin app.PalindromeMain   # Para el punto 1
java -cp bin app.PooMain          # Para el punto 2
```

También puedes ejecutarlos desde un IDE como IntelliJ IDEA o Eclipse.

---

## 🧾 Notas

- El proyecto **no usa frameworks web** como Spring Boot.
- No se incluye Swagger, ya que no se exponen APIs HTTP.
- Se utilizó Java puro y una estructura modular para claridad y mantenibilidad.
- Se recomienda revisar el código fuente acompañado de los comentarios JavaDoc.

---

## 👤 Autor

**Ichel Delgado**  
Aspirante al cargo de Desarrollador de Software Junior  
GitHub: [@icheld123](https://github.com/icheld123)
