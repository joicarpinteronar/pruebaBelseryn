package pruebaPortalViva.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;


public class ClasesDeVueloDisponiblesTres implements Question<String> {

  private String clasetres;

  public ClasesDeVueloDisponiblesTres() {
     this.clasetres = clasetres;
  }

  public static ClasesDeVueloDisponiblesTres verQueCadaClaseDeVueloEstaEnTres() {
    return new ClasesDeVueloDisponiblesTres();
  }

  @Override
  public String answeredBy(Actor actor) {
    clasetres = Text.of(DetallesDelViaje.LBL_TARIFA_FULL).viewedBy(actor).asString();
    return clasetres;
  }
}
