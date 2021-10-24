package pruebaPortalAvianca.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetallesDelViaje {

  public static final Target OPCION_SOLO_IDA =
      Target.the("opción de vuelo sólo ida").located(By.cssSelector("li[data-tipo-tab='tab-ow']"));

  public static final Target ORIGEN =
      Target.the("el campo de origen")
          .located(
              By.xpath(
                  "//div[2]/div/form/div/div[2]/div/div/div/fieldset/div/div/div/div/label/div/input"));

  public static final Target DESTINO =
      Target.the("el campo de destino")
          .located(
              By.xpath(
                  "//div[2]/div/form/div/div[2]/div/div/div/fieldset/div/div[2]/div[2]/div/label/div/input"));

  public static final Target OPCION_DESPLEGABLE =
      Target.the("la opción {0} de la lista desplegable")
          .located(By.xpath("//div/div[2]/ul/li/div"));

  public static final Target OPCION_DESPLEGABLE_DESTINO =
      Target.the("la opción {0} de la lista desplegable destino")
          .located(By.xpath("//div[2]/div[2]/ul/li/div[2]"));

  public static final Target BOTON_CALENDARIO_SALIDA =
      Target.the("el botón para seleccionar la fecha de salida")
          .locatedBy("//*[@name='pbFechaIda' and @class='form-control solo-ida x-mvvm error']");

  public static final Target FECHA_DE_SALIDA =
      Target.the("la fecha de salida")
          .located(By.xpath("//div[2]/fieldset/div/div/div/label/div/input"));

  public static final Target BOTON_CONSULTA =
      Target.the("el botón de consulta de vuelos")
          .located(By.xpath("//button[contains(text(), 'Buscar vuelos') and @id='iniciaFlujo']"));

  public static final Target NUMERO_PASAJEROS =
      Target.the("Combo box de numero de pasajeros")
          .located(By.cssSelector("input[id^='pbPasajeros_2']"));

  public static final Target LBL_NUMERO_PASAJEROS =
      Target.the("Label de numero de pasajeros")
          .located(
              By.xpath(
                  "/html/body/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/legend/h3"));

  public static final Target LISTA_PASAJE_UNO =
      Target.the("Lista de Pasajes")
          .located(
              By.xpath(
                  "/html/body/app-root/main/div/avail-page/div/avail-cont/avail-pres/div[2]/avail-list-pres/div[1]/expander-elem/div/div[1]/div/button"));
}
