package pruebaPortalAvianca.tasks;

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
import pruebaPortalAvianca.interactions.Wait;
import pruebaPortalAvianca.userinterfaces.DetallesDelViaje;

public class BuscarVuelosSoloIda implements Task {

  private final String origen;
  private final String destino;
  private final String fechaDeSalida;

  public BuscarVuelosSoloIda(String origen, String destino, String fechaDeSalida) {
    this.origen = origen;
    this.destino = destino;
    this.fechaDeSalida = fechaDeSalida;
  }

  @Override
  @Step(
      "{0} busca vuelos partiendo desde #origen hasta #destino a partir del dia de #fechaDeSalida")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Wait.forAbout(5),
        WaitUntil.the(DetallesDelViaje.OPCION_SOLO_IDA, isEnabled()).forNoMoreThan(10).seconds(),
        Click.on(DetallesDelViaje.OPCION_SOLO_IDA),
        Wait.forAbout(5),
        SeleccionarItinerario.de(origen).a(destino),
        WaitUntil.the(DetallesDelViaje.FECHA_DE_SALIDA, isEnabled()).forNoMoreThan(10).seconds(),
        Enter.theValue(fechaDeSalida).into(DetallesDelViaje.FECHA_DE_SALIDA),
        Click.on(DetallesDelViaje.NUMERO_PASAJEROS),
        Enter.theValue(Keys.TAB).into(DetallesDelViaje.NUMERO_PASAJEROS),
        Click.on(DetallesDelViaje.LBL_NUMERO_PASAJEROS),
        Enter.theValue(Keys.ENTER).into(DetallesDelViaje.LBL_NUMERO_PASAJEROS),
        Wait.forAbout(30),
        Click.on(DetallesDelViaje.LISTA_PASAJE_UNO));
  }

  public static Performable ingresarDestinos(String origen, String destino, String fechaDeSalida) {
    return instrumented(BuscarVuelosSoloIda.class, origen, destino, fechaDeSalida);
  }
}
