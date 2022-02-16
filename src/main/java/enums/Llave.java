package enums;

public enum Llave {

    LLAVE("Datos del producto");

    String llave;

    private Llave(String key) {
        this.llave = key;
    }

    public String getLlave() {
        return llave;
    }
}
