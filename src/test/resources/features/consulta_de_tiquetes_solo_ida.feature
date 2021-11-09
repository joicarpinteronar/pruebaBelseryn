# language: es

Característica: Consultar tiquetes economicos solo de ida
dada la pagina https://www.vivaair.com/#/co/es
Como viajero casual
Quiero poder consultar tiquetes economicos

  Escenario: Ivan quiere viajar de Bogota a Santa Marta y quiere ver los vuelos disponibles
  Ivan prefiere viajar en clase economica.
  y prefiere consultar solo vuelos de ida.

    Dado que Ivan ha decidido consultar la disponibilidad de vuelos
    Cuando el ingresa el origen Bogota y destino Santa Marta del viaje y el dia 5
    Entonces el deberia ver las siguientes opciones de clase de vuelo: Tarifa Base, Tarifa Medium, Tarifa Full
    Y el selecciona el vuelo mas economico


