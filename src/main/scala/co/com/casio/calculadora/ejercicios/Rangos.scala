package co.com.casio.calculadora.ejercicios

/**
  * El Rango describe un rango entre numeros asi
  */

object Rangos extends App {

  val oneTo10 = 1 to 10
  println(s"rango del uno al diez asi: 1 to 10 : $oneTo10")
  oneTo10 foreach println

  val oneTo10By2 = 1 to 10 by 2
  println(s"Rando del 1 al 10 de numeros con tamaño de paso de 2 asi: 1 to 10 by 2: $oneTo10By2")
  oneTo10By2 foreach println

  /**
    * Tambien es posible crear rangos sin el ultimo numero con el metodo until asi;
    */
  val oneUntil5 = 1 until 5
  println(s"Para crear un rango sin el ultimo numero se utiliza el metodo until asi: 1 until 5: $oneUntil5")
  oneUntil5 foreach println
}
