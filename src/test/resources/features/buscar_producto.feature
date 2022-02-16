#language: es
Característica: Buscar producto
  Yo como cliente del my store
  Necesito realizar la busqueda de un producto en el portal web
  Para adicionarlo al carritto de compra


  @BuscarProducto
  Escenario: Validar que un cliente pueda agregar un producto al carrito de compras
    Dado que el cliente ingresa al portal de compras de my store
    Cuando el cliente agrega al carrito de compras el producto buscado
      | nombreDelProducto     | precio | descuento | precioTotal |
      | Printed Chiffon Dress | $16.40 | -20%      | $18.40      |
    Entonces el cliente podra visualizar los datos del producto en el carrito de compras