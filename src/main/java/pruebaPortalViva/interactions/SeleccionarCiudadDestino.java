package pruebaPortalViva.interactions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pruebaPortalViva.models.CiudadDestinoBuilder;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;

public class SeleccionarCiudadDestino implements Interaction {

  private String ciudad;
  private Target listaDondeSeUbica;

  public SeleccionarCiudadDestino(String ciudad, Target listaDondeSeUbica) {
    this.ciudad = ciudad;
    this.listaDondeSeUbica = listaDondeSeUbica;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Wait.forAbout(2),
        Enter.theValue(ciudad).into(listaDondeSeUbica),
        WaitUntil.the(DetallesDelViaje.OPCION_DESPLEGABLE_DESTINO, isVisible()),
        Click.on(DetallesDelViaje.OPCION_DESPLEGABLE_DESTINO));
  }

  public static CiudadDestinoBuilder deNombreDestino(String ciudad) {
    return new CiudadDestinoBuilder().deNombreDestino(ciudad);
  }
}
