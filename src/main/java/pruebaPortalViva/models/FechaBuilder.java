package pruebaPortalViva.models;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import pruebaPortalViva.tasks.IngresarFecha;

public class FechaBuilder {

  private int dia;

  public FechaBuilder de(int dia) {
    this.dia = dia;
    return this;
  }

  public Performable en(Target campoDeFecha) {
    return instrumented(IngresarFecha.class, dia, campoDeFecha);
  }
}
