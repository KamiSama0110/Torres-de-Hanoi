# 🗼 Torres de Hanoi

Un juego clásico de las Torres de Hanoi implementado en Java con interfaz de consola.

## 📋 Descripción

Las **Torres de Hanoi** es un rompecabezas matemático inventado en 1883 por el matemático francés Édouard Lucas. El juego consiste en tres torres (A, B y C) y un número de discos de diferentes tamaños que pueden deslizarse en cualquier torre.

### Objetivo
Mover todos los discos desde la torre A (origen) hasta la torre C (destino), siguiendo estas reglas:
1. Solo se puede mover un disco a la vez
2. Solo se puede mover el disco que esté en la parte superior de una torre
3. Un disco más grande no puede colocarse sobre uno más pequeño

## 🛠️ Requisitos

- **Java JDK 8** o superior
- Terminal o consola de comandos

## 📁 Estructura del Proyecto

```
Torres-de-Hanoi/
├── src/
│   ├── logic/
│   │   ├── Disco.java      # Representa un disco con su tamaño
│   │   ├── Torre.java      # Representa una torre con su pila de discos
│   │   └── Juego.java      # Lógica principal del juego
│   └── main/
│       └── TorresDeHanoi.java  # Punto de entrada del programa
├── .gitignore
└── README.md
```

## 🚀 Instalación y Ejecución

### Opción 1: Compilar desde la línea de comandos

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/KamiSama0110/Torres-de-Hanoi.git
   cd Torres-de-Hanoi
   ```

2. **Compilar el proyecto:**
   ```bash
   javac -d out src/logic/*.java src/main/*.java
   ```

3. **Ejecutar el juego:**
   ```bash
   java -cp out main.TorresDeHanoi
   ```

### Opción 2: Usar un IDE (IntelliJ IDEA, Eclipse, VS Code)

1. Abrir el proyecto en tu IDE favorito
2. Marcar la carpeta `src` como carpeta de fuentes (sources)
3. Ejecutar la clase `TorresDeHanoi.java` ubicada en `src/main/`

## 🎮 Guía de Uso

### Paso 1: Iniciar el juego
Al ejecutar el programa, se te pedirá que ingreses el número de discos con los que deseas jugar:

```
Introduzca el numero de discos: 3
```

> 💡 **Consejo:** Para principiantes, se recomienda empezar con 3 discos. El número mínimo de movimientos para resolver el puzzle es `2^n - 1`, donde `n` es el número de discos.

### Paso 2: Entender la visualización
El juego mostrará las tres torres con sus discos. Los números representan el tamaño de cada disco (1 es el más pequeño):

```
Torre A:
3 
2 
1 

Torre B:

Torre C:
```

### Paso 3: Realizar movimientos
Para mover un disco:

1. **Ingresa la torre de origen** (A, B, o C) - de dónde quieres tomar el disco
2. **Ingresa la torre de destino** (A, B, o C) - a dónde quieres mover el disco

```
Elige la torre de origen (A, B, C): 
A
Elige la torre de destino (A, B, C): 
C
Movimiento exitoso!!
```

### Paso 4: Mensajes del juego
- **"Movimiento exitoso!!"** - El disco se movió correctamente
- **"Movimento incorrecto, pruebe otra vez!!"** - El movimiento no es válido (por ejemplo, intentar poner un disco grande sobre uno pequeño)
- **"Juego completado"** - ¡Ganaste! Todos los discos están en la torre C

## 📝 Ejemplo de Partida

```
Introduzca el numero de discos: 3

Torre A:
3 
2 
1 

Torre B:

Torre C:

Elige la torre de origen (A, B, C): 
A
Elige la torre de destino (A, B, C): 
C
Movimiento exitoso!!

Torre A:
3 
2 

Torre B:

Torre C:
1 

...continúa hasta completar el juego...
```

## 🧠 Estrategia para Resolver

Para resolver las Torres de Hanoi con el mínimo de movimientos:

1. **Con 3 discos (7 movimientos):**
   - A → C, A → B, C → B
   - A → C
   - B → A, B → C, A → C

2. **Regla general:** 
   - Si el número de discos es impar, el primer movimiento debe ser del disco más pequeño a la torre destino (C)
   - Si el número de discos es par, el primer movimiento debe ser del disco más pequeño a la torre auxiliar (B)

## 📊 Datos Curiosos

| Discos | Movimientos Mínimos |
|--------|---------------------|
| 3      | 7                   |
| 4      | 15                  |
| 5      | 31                  |
| 10     | 1,023               |
| 64     | 18,446,744,073,709,551,615 |

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes sugerencias de mejora:

1. Haz un Fork del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit de tus cambios (`git commit -m 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está disponible como código abierto.

---

⭐ Si te gustó este proyecto, ¡no olvides darle una estrella!
