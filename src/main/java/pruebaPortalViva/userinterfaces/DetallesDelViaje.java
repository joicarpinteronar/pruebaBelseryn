package pruebaPortalViva.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetallesDelViaje {

  public static final Target OPCION_SOLO_IDA =
      Target.the("opción de vuelo sólo ida").located(By.xpath("//span[contains(.,'Solo ida')]"));

  public static final Target SEL_ORIGEN =
          Target.the("el campo de origen").located(By.xpath("//input[@id='station']"));

  public static final Target ORIGEN =
      Target.the("el campo de origen").locatedBy("//input[@id='filter-station']");

  public static final Target DESTINO =
      Target.the("el campo de destino").locatedBy("//input[@id='filter-station-second']");

  public static final Target OPCION_DESPLEGABLE =
      Target.the("la opción {0} de la lista desplegable")
          .located(By.xpath("//div[2]/div/span[2]"));

  public static final Target OPCION_DESPLEGABLE_DESTINO =
      Target.the("la opción {0} de la lista desplegable destino")
          .located(By.xpath("//div[2]/div/span[2]"));

  public static final Target BOTON_CALENDARIO_SALIDA =
      Target.the("el botón para seleccionar la fecha de salida")
          .located(By.id("date"));

  public static final Target FECHA_DE_SALIDA =
      Target.the("la fecha de salida")
          .locatedBy("//div[2]/div[2]/div[3]/div[contains(text(), '{0}')]");

  public static final Target BOTON_BUSCAR =
      Target.the("el botón de buscar los vuelos")
          .located(By.xpath("//span[contains(.,'Buscar')]"));

  public static final Target SEL_PRIMER_ITINERARIO =
          Target.the("Seleccionar primer itinerario")
                  .located(By.xpath("//app-flight/div/div/div[2]"));

  public static final Target LBL_TARIFA_BASE =
      Target.the("Label Tarifa Base")
          .located(By.xpath("//div[@id='bundle-FCDB']/div/h4/div/div"));

  public static final Target LBL_TARIFA_MEDIUM =
      Target.the("Label Tarifa Medium")
          .located(
              By.xpath(
                  "//div[@id='bundle-FCDM']/div/h4/div/div"));

  public static final Target LBL_TARIFA_FULL =
      Target.the("Label Tarifa Full")
          .located(
              By.xpath(
                  "//div[@id='bundle-FCDF']/div/h4/div/div"));

  public static final Target BTN_SEL_TARIFA_ECONOMICA =
          Target.the("Boton seleccionar tarifa economica")
                  .located(
                          By.xpath(
                                  "//div[@id='bundle-FCDB']/button/div"));

  public static final Target BTN_CONTINUAR =
          Target.the("Boton continuar")
                  .located(By.xpath("//button[@id='booking-continue-btn']"));
}
