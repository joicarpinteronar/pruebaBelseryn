# language: es

Característica: Consultar tiquetes solo ida
Dado que no quiero gastar mucho tiempo en el aeropuerto
Como viajero casual
Quiero poder comprar tiquetes por internet


  Escenario: Ivan quiere viajar de Bogota a Santa Marta y quiere ver los vuelos disponibles
  Ivan prefiere viajar en clase economica.
  No está seguro cuando va a regresar, así que prefiere consultar solo vuelos de ida.

    Dado que Ivan ha decidido consultar la disponibilidad de vuelos
    Cuando el mira los vuelos de Bogotá a Santa Marta partiendo desde la fecha Mié, 17 nov.
    Entonces el deberia ver las siguientes opciones de clase de vuelo:
      | Súper Promo |
      | Viaja Ligero|
      | Más confort |
      | Más flexibilidad|