package pruebaPortalAvianca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import pruebaPortalAvianca.interactions.SeleccionarCiudad;
import pruebaPortalAvianca.interactions.SeleccionarCiudadDestino;
import pruebaPortalAvianca.models.SeleccionarItinerarioBuilder;
import pruebaPortalAvianca.userinterfaces.DetallesDelViaje;

public class SeleccionarItinerario implements Task {

  private String origen;
  private String destino;

  public SeleccionarItinerario(String origen, String destino) {
    this.origen = origen;
    this.destino = destino;
  }

  @Override
  @Step("{0} selecciona itinerario de #origen a #destino")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarCiudad.deNombre(origen).en(DetallesDelViaje.ORIGEN),
        SeleccionarCiudadDestino.deNombreDestino(destino).enDestino(DetallesDelViaje.DESTINO));
  }

  public static SeleccionarItinerarioBuilder de(String origen) {
    return new SeleccionarItinerarioBuilder().de(origen);
  }
}
