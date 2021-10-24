package pruebaPortalAvianca.tasks;

import java.time.LocalDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import pruebaPortalAvianca.models.FechaBuilder;
import pruebaPortalAvianca.models.FechaDeSalida;
import pruebaPortalAvianca.userinterfaces.DetallesDelViaje;

public class IngresarFecha implements Task {

  private int dia;
  private Target opcionCalendario;

  public IngresarFecha(int dia, Target opcionCalendario) {
    this.dia = dia;
    this.opcionCalendario = opcionCalendario;
  }

  @Override
  @Step("{0} ingresa la fecha de salida")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(opcionCalendario),
        Click.on(DetallesDelViaje.FECHA_DE_SALIDA.of(getMes(), getDia())));
  }

  private String getDia() {
    return String.valueOf(LocalDate.now().plusDays(dia).getDayOfMonth());
  }

  private String getMes() {
    return String.valueOf(LocalDate.now().getMonth().ordinal());
  }

  public static FechaBuilder de(FechaDeSalida fechaDeSalida) {
    return new FechaBuilder().de(fechaDeSalida.diaDesdeHoy());
  }
}
