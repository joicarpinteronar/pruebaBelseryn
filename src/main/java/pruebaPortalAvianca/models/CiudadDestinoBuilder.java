package pruebaPortalAvianca.models;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import pruebaPortalAvianca.interactions.SeleccionarCiudadDestino;

public class CiudadDestinoBuilder {

  private String nombre;

  public CiudadDestinoBuilder deNombreDestino(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public Performable enDestino(Target listaDondeSeUbica) {
    return instrumented(SeleccionarCiudadDestino.class, nombre, listaDondeSeUbica);
  }
}
