PROYECTO - ALGORITMOS
Sistema de inventario y ventas en Java

REQUISITOS
- Java JDK 8 o superior.
- IDE recomendado: NetBeans, IntelliJ IDEA o Visual Studio Code con extensiones de Java.

ESTRUCTURA
src/modelo: clases Producto, Cliente, empleado, bodega, inventario, ordencompra y DetalleOrden.
src/datos: archivoUtil, encargado de guardar y leer objetos.
src/vista: ventanaPrincipal, menú gráfico del sistema.
datos: carpeta que se crea automáticamente para almacenar los archivos .dat.
documentacion: manuales y diagrama UML.

EJECUTAR
1. Abra la carpeta "Proyecto - Algoritmos" en su IDE.
2. Compile todos los archivos dentro de src.
3. Ejecute la clase vista.ventanaPrincipal.
También puede ejecutar desde terminal, dentro de la carpeta del proyecto:
  javac -encoding UTF-8 -d build src/modelo/*.java src/datos/*.java src/vista/*.java
  java -cp build vista.ventanaPrincipal

FUNCIONES
- Registrar, consultar, modificar precio y eliminar productos.
- Registrar, consultar y eliminar clientes y empleados.
- Registrar bodegas con un empleado encargado.
- Agregar, consultar y retirar existencias.
- Crear órdenes con uno o varios productos y sus cantidades.
- Completar una orden: valida existencias y descuenta el stock.
- Cancelar órdenes pendientes sin descontar stock.
- Guardar la información en archivos .dat para conservarla al cerrar el programa.

IMPORTANTE
La primera vez los listados estarán vacíos. Registre productos, clientes, empleados y bodegas; después agregue existencias antes de completar ventas. Los archivos de datos se guardan en la carpeta datos, relativa a la carpeta desde donde se ejecuta el programa.
