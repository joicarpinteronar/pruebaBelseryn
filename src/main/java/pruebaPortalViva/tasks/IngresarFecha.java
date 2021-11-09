package pruebaPortalViva.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pruebaPortalViva.interactions.Wait;

import pruebaPortalViva.userinterfaces.DetallesDelViaje;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresarFecha implements Task {


  private final String dia;

  public IngresarFecha(String dia) {
    this.dia = dia;
  }

  @Override
  @Step("{0} ingresa la fecha de salida")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
       Wait.forAbout(3),
       WaitUntil.the(DetallesDelViaje.BOTON_CALENDARIO_SALIDA, isEnabled()).forNoMoreThan(10).seconds(),
       Click.on(DetallesDelViaje.BOTON_CALENDARIO_SALIDA),
       Click.on(DetallesDelViaje.FECHA_DE_SALIDA.of(dia)),
       WaitUntil.the(DetallesDelViaje.BOTON_BUSCAR, isEnabled()).forNoMoreThan(10).seconds(),
       Click.on(DetallesDelViaje.BOTON_BUSCAR),
       Wait.forAbout(10),
       WaitUntil.the(DetallesDelViaje.SEL_PRIMER_ITINERARIO, isEnabled()).forNoMoreThan(10).seconds(),
       Click.on(DetallesDelViaje.SEL_PRIMER_ITINERARIO),
       Wait.forAbout(10)
        );
  }

  public static IngresarFecha ingresarDia(String dia) {
    return Tasks.instrumented(IngresarFecha.class, dia);
  }
}
