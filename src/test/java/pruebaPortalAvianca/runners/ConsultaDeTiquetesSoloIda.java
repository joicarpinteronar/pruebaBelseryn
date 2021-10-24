package pruebaPortalAvianca.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/consulta_de_tiquetes_solo_ida.feature",
    glue = "pruebaPortalAvianca.stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ConsultaDeTiquetesSoloIda {}
