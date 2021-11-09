package pruebaPortalViva.models;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import pruebaPortalViva.interactions.SeleccionarCiudad;

public class CiudadBuilder {

  private String nombre;

  public CiudadBuilder deNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public Performable en(Target listaDondeSeUbica) {
    return instrumented(SeleccionarCiudad.class, nombre, listaDondeSeUbica);
  }
}
