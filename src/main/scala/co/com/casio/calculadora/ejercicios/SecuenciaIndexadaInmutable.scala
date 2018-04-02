package co.com.casio.calculadora.ejercicios

/**
  * Las secuencias indexadas inmutables son utiles cuando se necesita utilizar
  * valores que se encuentran en medio de una lista; y por lo tanto no hay necesidad de
  * pasar por los valores del principio de la misma por ejemplo el VECTOR. Como todas las
  * otras colecciones los vectores tambien son funcionesParicales e implementan el metodo
  * vector.isDefinedAt ()
  */

object SecuenciaIndexadaInmutable extends App {

  val vector = Vector(1, 2, 3)

  /**
    * Para agregar valores al vector podemos utilizar los metodos 'vector :+ item' o 'item +: vector'
    */

  val vectorMasOcho = vector :+ 8
  val vectorMasDiez = 10 +: vector

  println(s"El vector es: $vector")
  println(s"El vectorMasOcho es: $vectorMasOcho")
  println(s"El vectorMasDiez es: $vectorMasDiez")
  /**
    * Para recuperar un valor del vector en un indice determinado se hace de la manera vector(indice) ASI;:
    */

  println(s"El item en la posicion vectorMasOcho(3) es : ${vectorMasOcho(3)}")

  println(s"vector contiene posicion 5?? : ${vectorMasOcho.isDefinedAt(5)}")

  /**
    * Con el metodo vector.update (indice, itemNuevo) podemos reemplazar un item de la posicion dada por el
    * nuevo item. Es necesario tener e cuenta que como estamos trabajando con valores inmutables se crea
    * un nuevo vector con el itemNuevo en la posicion dada; por lo tanto si imprimimos vector tedra los mismos
    * valores antes del updated
    */

  val vectorConUpdate = vector.updated(2, 10)
  println(s"Los valores del vector son: $vector")
  println(s"Los valores del nuevo vector.updated(2, 10) son: $vectorConUpdate")



}
