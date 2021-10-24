package pruebaPortalAvianca.models;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;
import pruebaPortalAvianca.tasks.BuscarVuelosSoloIda;

public class BuscarVuelosSoloIdaBuilder {

  private String origen;
  private String destino;

  public BuscarVuelosSoloIdaBuilder de(String origen) {
    this.origen = origen;
    return this;
  }

  public BuscarVuelosSoloIdaBuilder a(String destino) {
    this.destino = destino;
    return this;
  }

  public Performable patiendoDesde() {
    return instrumented(BuscarVuelosSoloIda.class, origen, destino);
  }
}
