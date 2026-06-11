# FerreSys - Sistema de gestion para ferreteria

Proyecto academico en Java para el curso de Diseno de Patrones de la UTP. El sistema modela una venta de ferreteria aplicando POO, principios de bajo acoplamiento y patrones GOF sobre un dominio simple pero defendible.

## Contexto academico

| Campo | Detalle |
|---|---|
| Institucion | UTP |
| Curso | Diseno de Patrones |
| Ciclo | 05 |
| Proyecto | FerreSys |
| Dominio | Gestion de ventas e inventario para ferreteria |

## Alcance actual

El proyecto permite crear clientes, usuarios y productos, registrar una venta, validar stock disponible, calcular subtotal, IGV y total, y emitir una alerta cuando un producto llega al stock minimo.

La aplicacion se ejecuta por consola porque el objetivo principal es demostrar diseno orientado a objetos y patrones, no construir una interfaz grafica.

## Estructura

```txt
src/
`-- pe/edu/utp/fersys/
    |-- app/
    |   `-- Main.java
    |-- factory/
    |   `-- ProductoFactory.java
    |-- facade/
    |   `-- VentaFacade.java
    |-- observer/
    |   |-- AlertaStockObserver.java
    |   `-- StockObserver.java
    `-- modelo/
        |-- cliente/
        |-- persona/
        |-- producto/
        |-- usuario/
        `-- venta/
```

## Componentes principales

| Componente | Responsabilidad |
|---|---|
| `Persona` | Abstrae datos comunes de clientes y usuarios |
| `Cliente` | Representa al comprador registrado |
| `Usuario` | Representa al trabajador que opera el sistema |
| `Producto` | Controla precio, stock y stock minimo |
| `Venta` | Agrupa detalles, descuenta stock y calcula importes |
| `DetalleVenta` | Calcula el subtotal de una linea de venta |
| `ProductoFactory` | Centraliza la creacion de productos de ejemplo |
| `VentaFacade` | Simplifica el registro y resumen de ventas |
| `StockObserver` | Define el contrato de notificacion por stock |
| `AlertaStockObserver` | Muestra alerta cuando un producto llega al stock minimo |

## Conceptos aplicados

| Concepto | Aplicacion en el proyecto |
|---|---|
| POO | Clases, encapsulamiento, herencia, abstraccion y polimorfismo |
| GRASP Experto | `Producto` controla stock, `Venta` calcula totales y `DetalleVenta` calcula su subtotal |
| Bajo acoplamiento | `Main` delega creacion, registro y alertas a clases especializadas |
| Factory | `ProductoFactory` crea productos sin exponer datos de construccion en `Main` |
| Facade | `VentaFacade` ofrece una entrada simple para registrar productos y mostrar resumen |
| Observer | `Venta` notifica cambios de stock a observadores como `AlertaStockObserver` |

## Flujo demostrado

1. Se crean cliente y usuario.
2. `ProductoFactory` crea productos de ejemplo.
3. Se crea una `Venta`.
4. Se registra `AlertaStockObserver` como observador de stock.
5. `VentaFacade` registra productos en la venta.
6. `Venta` descuenta stock y notifica observadores.
7. Se muestra el resumen con subtotal, IGV y total.

## Ejecucion local

Desde la raiz del repositorio:

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out pe.edu.utp.fersys.app.Main
```

## Estado

| Item | Estado |
|---|---|
| Modelo base POO | Implementado |
| Modelo de productos y ventas | Implementado |
| Validacion de stock | Implementado |
| Calculo de subtotal, IGV y total | Implementado |
| Factory | Implementado |
| Facade | Implementado |
| Observer | Implementado |
| Comentarios tecnicos de apoyo | Implementado |
| Builder para comprobantes o reportes | Pendiente |
| Documentacion UML y sustento final | Pendiente |

## Pendientes reales

- Implementar Builder para construir comprobantes o reportes de venta.
- Documentar UML de clases y relaciones principales.
- Preparar una explicacion formal de patrones GOF y GRASP aplicados.
- Evaluar si se agrega una capa de servicio o controlador para reforzar GRASP Controlador.
