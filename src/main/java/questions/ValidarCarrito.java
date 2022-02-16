package questions;

import enums.Llave;
import exceptions.ExcepcionGeneral;
import interactions.DarClic;
import models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;



import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.CarritoDeCompra.CARRITO;
import static userinterfaces.CarritoDeCompra.DESCUENTO;
import static userinterfaces.CarritoDeCompra.PRECIO_TOTAL;
import static userinterfaces.CarritoDeCompra.PRECIO_UNITARIO;

public class ValidarCarrito implements Question<Boolean> {


    private List<Producto> producto = theActorInTheSpotlight().recall(Llave.LLAVE.getLlave());


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(DarClic.enElemento(CARRITO));
        actor.attemptsTo(Scroll.to(PRECIO_UNITARIO));
        try {

            PRECIO_UNITARIO.resolveFor(actor).getText()
                    .equals(producto.get(0).getPrecio());

            DESCUENTO.resolveFor(actor).getText()
                    .equals(producto.get(0).getDescuento());

            PRECIO_TOTAL.resolveFor(actor).getText()
                    .equals(producto.get(0).getPrecioTotal());
            return true;
        } catch (ExcepcionGeneral ex) {
            return false;
        }
    }


    public static ValidarCarrito esteVacio() {
        return new ValidarCarrito();
    }
}