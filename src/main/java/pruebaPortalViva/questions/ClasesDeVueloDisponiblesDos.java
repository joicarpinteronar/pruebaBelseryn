package pruebaPortalViva.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pruebaPortalViva.userinterfaces.DetallesDelViaje;


public class ClasesDeVueloDisponiblesDos implements Question<String> {

  private String clasedos;


  public ClasesDeVueloDisponiblesDos() {
    this.clasedos = clasedos;
  }

  public static ClasesDeVueloDisponiblesDos verQueCadaClaseDeVueloEstaEnDos() {
    return new ClasesDeVueloDisponiblesDos();
  }

  @Override
  public String answeredBy(Actor actor) {
    clasedos = Text.of(DetallesDelViaje.LBL_TARIFA_MEDIUM).viewedBy(actor).asString();
    return clasedos;
  }
}
