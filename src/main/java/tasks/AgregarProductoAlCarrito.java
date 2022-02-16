package tasks;


import interactions.DarClic;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ResultadoDeBusqueda.BTN_AGREGAR_AL_CARRITO;


public class AgregarProductoAlCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_AGREGAR_AL_CARRITO));
        actor.attemptsTo(DarClic.enElemento(BTN_AGREGAR_AL_CARRITO));

    }

    public static AgregarProductoAlCarrito agregarProductoAlCarrito() {
        return instrumented(AgregarProductoAlCarrito.class);
    }

}