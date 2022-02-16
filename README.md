# Automatizacion Buscar Producto en My Store

Un proyecto donde se ejemplifica el uso del patrón serenity screenplay con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web de My Store.

Por defecto, los tests corren en Chrome.


# Detalles generales de la implementación

El siguiente proyecto consiste en la automatización de buscar un producto dentro de la página de compras http://automationpractice.com/index.php, el robot abre el navegador e ingresa a la URL ya mencionada, seguido se digita la información del producto a buscar en la barra de búsqueda y da un enter para obtener los resultados, se realiza una acción de click sobre el producto para abrir el detalle del mismo, luego se agrega el producto al carrito de compras, el rotot ingresa al carrito de compras para ver el detalle de los productos ingresados, además el robot verifica que el producto en el carrito si es el que se agregó, para eso se compara el valor del producto, su descuento y por último el valor a total a pagar, al final de la verificación se cierra el navegador.


# Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 5.4.

#  Para correr el proyecto

"gradle clean test aggregate" es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity, dentro encontraremos un archivo llamado index.html