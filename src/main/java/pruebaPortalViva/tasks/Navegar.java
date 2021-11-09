package pruebaPortalViva.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import pruebaPortalViva.userinterfaces.Url;

public class Navegar implements Task {

  @Step("{0} navega a la opción #opcion")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn().the(Url.class));
  }

  public static Navegar a() {
    return instrumented(Navegar.class);
  }
}
