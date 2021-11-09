package pruebaPortalViva.userinterfaces;

public enum Opcion {
  SeleccionaTuViaje("https://www.vivaair.com/#/co/es");

  private final String url;

  Opcion(String url) {
    this.url = url;
  }

  public String url() {
    return url;
  }
}
