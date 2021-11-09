package pruebaPortalViva.interactions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pruebaPortalViva.models.CiudadBuilder;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;

public class SeleccionarCiudad implements Interaction {

  private String ciudad;
  private Target listaDondeSeUbica;

  public SeleccionarCiudad(String ciudad, Target listaDondeSeUbica) {
    this.ciudad = ciudad;
    this.listaDondeSeUbica = listaDondeSeUbica;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Wait.forAbout(2),
        Click.on(DetallesDelViaje.ORIGEN),
        Enter.theValue(ciudad).into(listaDondeSeUbica),
        WaitUntil.the(DetallesDelViaje.OPCION_DESPLEGABLE, isVisible()),
        Click.on(DetallesDelViaje.OPCION_DESPLEGABLE));
  }

  public static CiudadBuilder deNombre(String ciudad) {
    return new CiudadBuilder().deNombre(ciudad);
  }
}
