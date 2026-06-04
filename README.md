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

La version actual contiene entidades de cliente y usuario, herencia desde una clase abstracta `Persona` y enumeraciones para tipo de cliente y rol de usuario.

## Tecnologias usadas

- Java
- Programacion orientada a objetos
- Herencia
- Clases abstractas
- Enumeraciones
- Paquetes por dominio

## Que contiene el repositorio

```txt
utp-ferreteria-sys-patrones/
|-- src/
|   |-- Main.java
|   `-- pe/edu/utp/modelo/
|       |-- cliente/
|       |-- persona/
|       `-- usuario/
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
| `Main` | Ejecuta una demostracion basica por consola |

## Punto de entrada

```txt
src/Main.java
```

## Ejecucion local

Desde la raiz del repositorio:

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out Main
```

## Estado del proyecto

| Punto | Estado |
|---|---|
| Modelo base de persona | Implementado |
| Modelo de cliente | Implementado |
| Modelo de usuario | Implementado |
| Enums de clasificacion | Implementados |
| Demostracion en consola | Implementada |
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
