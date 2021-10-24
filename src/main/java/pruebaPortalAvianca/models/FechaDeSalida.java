package pruebaPortalAvianca.models;

public enum FechaDeSalida {
  mañana(1);

  private final int diaDesdeHoy;

  FechaDeSalida(int diaDesdeHoy) {
    this.diaDesdeHoy = diaDesdeHoy;
  }

  public int diaDesdeHoy() {
    return diaDesdeHoy;
  }
}
