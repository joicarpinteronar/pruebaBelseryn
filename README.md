## Project: prueba-viva-air-plataforma-web

serenity-cucumber-gradle-screenplay
Este es un proyecto donde se ejemplifica el uso del screenplay con cucumber y gradle.
Utilizando el Framework de Serenity

Las pruebas de este ejemplo se corren contra la página web de Viva Air.

Por defecto, los tests corren en Chrome.

Detalles generales de la implementación
Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface) definidas en prueba-portal-viva-air.

La estructura completa del proyecto es la siguiente:

+ model
  Clases que usan el patrón object builder o relcionadas con el modelo de dominio
+ tasks
  Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
  Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
  Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
  Objectos usados para consultar acerca del estado de la aplicación

Requerimientos
Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 7.0.1

Para correr el proyecto
clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/