package pruebaPortalViva.models;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;
import pruebaPortalViva.tasks.SeleccionarItinerario;

public class SeleccionarItinerarioBuilder {

  private String origen;

  public SeleccionarItinerarioBuilder de(String origen) {
    this.origen = origen;
    return this;
  }

  public Performable a(String destino) {
    return instrumented(SeleccionarItinerario.class, origen, destino);
  }
}
