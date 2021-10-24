package pruebaPortalAvianca.questions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;
import net.serenitybdd.screenplay.Consequence;
import pruebaPortalAvianca.exceptions.ClaseDeVueloNoDisponible;
import pruebaPortalAvianca.userinterfaces.ListaDeVuelos;

public class ClasesDeVueloDisponibles {

  public static Consequence[] verQueCadaClaseDeVueloEstaEn(List<String> clasesDeVuelo) {
    return clasesDeVuelo
        .stream()
        .map(
            clase ->
                seeThat(the(ListaDeVuelos.CLASE_DE_VUELO.of(clase)), isVisible())
                    .orComplainWith(
                        ClaseDeVueloNoDisponible.class,
                        mensajeDeErrorParaClaseDeVueloFaltante(clase)))
        .collect(Collectors.toList())
        .toArray(new Consequence[] {});
  }

  private static String mensajeDeErrorParaClaseDeVueloFaltante(String clase) {
    return MessageFormat.format("La clase {0} no fue encontrada", clase);
  }
}
