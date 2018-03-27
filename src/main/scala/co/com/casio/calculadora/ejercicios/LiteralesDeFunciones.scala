package co.com.casio.calculadora.ejercicios

object LiteralesDeFunciones extends App {

  val value1 = 10
  val value2 = 5

  //(value1: Int, value2: Int) => Int
  val compareFuncLiteral = (value1: Int, value2: Int) => if (value1 == value2) 0 else if (value1 > value2) 1 else -1

  //(index: Int) => Unit
  def print(index: Int) = println(s"Printing Page $index.")


}
