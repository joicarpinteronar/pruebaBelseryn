package pruebaPortalViva.stepdefinitions;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;
import static pruebaPortalViva.questions.ClasesDeVueloDisponibles.verQueCadaClaseDeVueloEstaEn;
import static pruebaPortalViva.utils.Utilities.getRandomDriver;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.List;

import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import pruebaPortalViva.events.EnUnFrame;

import pruebaPortalViva.questions.ClasesDeVueloDisponibles;
import pruebaPortalViva.questions.ClasesDeVueloDisponiblesDos;
import pruebaPortalViva.questions.ClasesDeVueloDisponiblesTres;
import pruebaPortalViva.tasks.BuscarVuelosSoloIda;
import pruebaPortalViva.tasks.IngresarFecha;
import pruebaPortalViva.tasks.Navegar;
import pruebaPortalViva.tasks.SeleccionarVueloEconomico;

public class ConsultaDeTiquetesStepDefinitions {

  WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

  @Before
  public void setStage() {
    OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
  }

  @Dado("^que (.*) ha decidido consultar la disponibilidad de vuelos")
  public void abrirUrl(String nombreActor) {
    theActorCalled(nombreActor).wasAbleTo(Navegar.a());
  }

  @Cuando("^el ingresa el origen (.*) y destino (.*) del viaje y el dia (.*)")
  public void elBuscaLosVuelos(String origen, String destino, String dia) {
    theActorInTheSpotlight().attemptsTo(BuscarVuelosSoloIda.ingresarDestinos(origen, destino));
    theActorInTheSpotlight().attemptsTo(IngresarFecha.ingresarDia(dia));
  }

  @Entonces("^el deberia ver las siguientes opciones de clase de vuelo: (.*), (.*), (.*)$")
  public void ellaDeberiaLasSiguientesOpcionesDeClaseDeVuelo(String claseuno, String clasedos, String clasetres){
    theActorInTheSpotlight().should(seeThat(ClasesDeVueloDisponibles.verQueCadaClaseDeVueloEstaEn(),equalTo(claseuno)));
    theActorInTheSpotlight().should(seeThat(ClasesDeVueloDisponiblesDos.verQueCadaClaseDeVueloEstaEnDos(),equalTo(clasedos)));
    theActorInTheSpotlight().should(seeThat(ClasesDeVueloDisponiblesTres.verQueCadaClaseDeVueloEstaEnTres(),equalTo(clasetres)));

  }

  @Y("^el selecciona el vuelo mas economico")
  public void seleccionarVuelo() {
    theActorInTheSpotlight().attemptsTo(SeleccionarVueloEconomico.seleccionarVueloEco());

  }

}
