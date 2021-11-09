package pruebaPortalViva.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import pruebaPortalViva.interactions.Wait;
import pruebaPortalViva.models.SeleccionarVuelo;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;

public class BuscarVuelosSoloIda implements Task {

  private String origen;
  private String destino;

  public BuscarVuelosSoloIda(String origen, String destino ) {
    this.origen = origen;
    this.destino = destino;
  }

  @Override
  @Step(
      "{0} busca vuelos partiendo desde #origen hasta #destino a partir del dia de #fechaDeSalida")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(DetallesDelViaje.OPCION_SOLO_IDA, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(DetallesDelViaje.OPCION_SOLO_IDA),
        WaitUntil.the(DetallesDelViaje.SEL_ORIGEN, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(DetallesDelViaje.SEL_ORIGEN),
        WaitUntil.the(DetallesDelViaje.SEL_ORIGEN, isEnabled()).forNoMoreThan(10).seconds(),
        Enter.theValue(origen).into(DetallesDelViaje.ORIGEN),
        WaitUntil.the(DetallesDelViaje.OPCION_DESPLEGABLE, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(DetallesDelViaje.OPCION_DESPLEGABLE),
        WaitUntil.the(DetallesDelViaje.DESTINO, isEnabled()).forNoMoreThan(10).seconds(),
        Enter.theValue(destino).into(DetallesDelViaje.DESTINO),
        WaitUntil.the(DetallesDelViaje.OPCION_DESPLEGABLE_DESTINO, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(DetallesDelViaje.OPCION_DESPLEGABLE_DESTINO),
        Wait.forAbout(5)
        );
  }

  public static Performable ingresarDestinos(String origen, String destino) {
    return instrumented(BuscarVuelosSoloIda.class, origen, destino);
  }
}
