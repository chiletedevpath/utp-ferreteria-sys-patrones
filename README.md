# UTP Ferreteria Sys Patrones

Proyecto academico en Java para modelar entidades base de un sistema de ferreteria y preparar la aplicacion de patrones de diseno.

## Autor

- Chilete DevPath
- Estudiante de Ingenieria de Sistemas e Informatica

## Contexto academico

- Institucion: UTP
- Ciclo: 05
- Curso: Patrones de Diseno
- Tipo: Proyecto academico

## Por que se hizo

Este proyecto se desarrollo para practicar modelado orientado a objetos y sentar una base sobre la cual aplicar patrones de diseno en un sistema de ferreteria.

La version actual contiene el modelo base de persona, cliente, usuario, producto y venta dentro del paquete `pe.edu.utp.fersys`, con comentarios tecnicos para apoyar la exposicion academica.

## Tecnologias usadas

- Java
- Programacion orientada a objetos
- Herencia
- Clases abstractas
- Enumeraciones
- Paquetes por dominio
- Patron Factory

## Que contiene el repositorio

```txt
utp-ferreteria-sys-patrones/
|-- src/
|   `-- pe/edu/utp/fersys/
|       |-- app/
|       |   `-- Main.java
|       |-- factory/
|       |   `-- ProductoFactory.java
|       `-- modelo/
|           |-- cliente/
|           |-- persona/
|           |-- producto/
|           |-- usuario/
|           `-- venta/
|-- .gitignore
`-- README.md
```

## Modelo actual

| Elemento | Responsabilidad |
|---|---|
| `Persona` | Clase abstracta base para datos personales |
| `Cliente` | Representa clientes de la ferreteria |
| `Usuario` | Representa usuarios del sistema |
| `TipoCliente` | Enumera tipos de cliente |
| `RolUsuario` | Enumera roles de usuario |
| `Producto` | Representa articulos y controla stock |
| `Categoria` | Clasifica productos por rubro |
| `DetalleVenta` | Calcula el subtotal de una linea de venta |
| `Venta` | Agrupa detalles y calcula subtotal, IGV y total |
| `ProductoFactory` | Centraliza la creacion de productos de ejemplo |
| `Main` | Ejecuta una demostracion basica por consola |

## Punto de entrada

```txt
src/Main.java
```

## Ejecucion local

Desde la raiz del repositorio:

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out pe.edu.utp.fersys.app.Main
```

## Estado del proyecto

| Punto | Estado |
|---|---|
| Modelo base de persona | Implementado |
| Modelo de cliente | Implementado |
| Modelo de usuario | Implementado |
| Enums de clasificacion | Implementados |
| Modelo de producto | Implementado |
| Modelo de venta | Implementado |
| Patron Factory para productos | Implementado |
| Demostracion en consola | Implementada |
| Comentarios tecnicos de exposicion | Implementados |
| Patrones de diseno documentados | Pendiente |
| Aplicacion explicita de patrones | Pendiente |

## Aprendizajes aplicados

- Modelado de entidades en Java.
- Uso de herencia con clase abstracta.
- Organizacion por paquetes.
- Uso de enumeraciones para reglas de dominio.
- Preparacion de una base para aplicar patrones de diseno.

## Pendientes

- Definir que patrones se aplicaran.
- Documentar el problema que resuelve cada patron.
- Agregar diagramas o ejemplos por patron.
- Ampliar el dominio del sistema de ferreteria.

## Relacion con Chilete DevPath

Este proyecto forma parte del registro academico de Chilete DevPath:

- [academia](https://github.com/chiletedevpath/academia)
- [aprendizaje](https://github.com/chiletedevpath/aprendizaje)
- [chiletedevpath](https://github.com/chiletedevpath/chiletedevpath)
