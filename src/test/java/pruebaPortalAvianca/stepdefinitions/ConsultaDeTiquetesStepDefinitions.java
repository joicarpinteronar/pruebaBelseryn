package pruebaPortalAvianca.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;
import static pruebaPortalAvianca.questions.ClasesDeVueloDisponibles.verQueCadaClaseDeVueloEstaEn;
import static pruebaPortalAvianca.utils.Utilities.getRandomDriver;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import pruebaPortalAvianca.events.EnUnFrame;
import pruebaPortalAvianca.tasks.BuscarVuelosSoloIda;
import pruebaPortalAvianca.tasks.Navegar;

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

  @Cuando("^el mira los vuelos de (.*) a (.*) partiendo desde la fecha (.*)")
  public void ellaBuscaLosVuelos(String origen, String destino, String fechaDeSalida) {
    theActorInTheSpotlight()
        .attemptsTo(BuscarVuelosSoloIda.ingresarDestinos(origen, destino, fechaDeSalida));
  }

  @Entonces("^el deberia ver las siguientes opciones de clase de vuelo:$")
  public void ellaDeberiaLasSiguientesOpcionesDeClaseDeVuelo(List<String> clasesDeVuelo)
      throws Throwable {
    EnUnFrame.llamado("FrameAmadeus")
        .entonces(theActorInTheSpotlight())
        .espera(verQueCadaClaseDeVueloEstaEn(clasesDeVuelo));
  }
}
