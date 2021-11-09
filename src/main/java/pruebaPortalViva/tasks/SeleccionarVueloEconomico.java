package pruebaPortalViva.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pruebaPortalViva.interactions.Wait;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarVueloEconomico implements Task {

    @Override
    @Step("{0} selecciona el vuelo mas economico")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DetallesDelViaje.BTN_SEL_TARIFA_ECONOMICA, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(DetallesDelViaje.BTN_SEL_TARIFA_ECONOMICA),
                Scroll.to(DetallesDelViaje.BTN_CONTINUAR),
                WaitUntil.the(DetallesDelViaje.BTN_CONTINUAR, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(DetallesDelViaje.BTN_CONTINUAR),
                Wait.forAbout(10)

        );
    }

    public static Performable seleccionarVueloEco() {
        return instrumented(SeleccionarVueloEconomico.class);
    }
}
