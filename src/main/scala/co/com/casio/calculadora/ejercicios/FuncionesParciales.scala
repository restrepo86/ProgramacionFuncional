package co.com.casio.calculadora.ejercicios

/**
  * FUNCIONES PARCIALES: Las funciones parciales son funciones
  * definidas para cumplir un propósito para un conjunto especifico
  * de parametros de entrada. NO SON SUFICIENTES PARA CADA ENTRADA DADA.
  *  trait PartialFunction[-A, +B] extends (A) => B
  */

object FuncionesParciales extends App {

  val oneToFirst: PartialFunction[Int, String] = {
    case 1 => "First"
  }

  /**
    * Como la funcion Parcial solo esta definida para el numero 1,
    * cuando le ingresemos otro valor lanzara un error; para preveer
    * esto, siempre que se usen funciones parciales se deve utilizar el
    * metodo partialFunction.idDefinedAt(parametro) que devuelve true si el parametro esta
    * definido para la funcion parcial, o false si no.
    */
  val parametro = 1
  val respuesta = if (oneToFirst.isDefinedAt(parametro)) oneToFirst(parametro) else s"Parametro no definido para el parametro $parametro."

  val respuestaError = if (oneToFirst.isDefinedAt(2)) oneToFirst(2) else "Parametro no definido para el parametro 2"

  println(respuesta)
  println(respuestaError)

}
