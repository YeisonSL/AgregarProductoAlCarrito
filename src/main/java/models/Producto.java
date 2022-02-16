package models;

public class Producto {

    private String nombreDelProducto;
    private String precio;
    private String descuento;
    private String precioTotal;


    public Producto(String nombreDelProducto, String precio, String descuento, String precioTotal) {
        this.nombreDelProducto = nombreDelProducto;
        this.precio = precio;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }
}
