package pruebaPortalViva.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;


public class ClasesDeVueloDisponibles implements Question<String> {

  private String claseuno;

  public ClasesDeVueloDisponibles() {
    this.claseuno = claseuno;
  }

  public static ClasesDeVueloDisponibles verQueCadaClaseDeVueloEstaEn() {
    return new ClasesDeVueloDisponibles();
  }

  @Override
  public String answeredBy(Actor actor) {
    claseuno = Text.of(DetallesDelViaje.LBL_TARIFA_BASE).viewedBy(actor).asString();
    return claseuno;
  }
}
