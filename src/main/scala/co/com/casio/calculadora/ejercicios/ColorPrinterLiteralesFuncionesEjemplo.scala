package co.com.casio.calculadora.ejercicios

import javax.swing.text.Document


object ColorPrinterLiteralesFuncionesEjemplo extends App {

  def printPages( lastIndex: Int, print: (Int) => Unit ) = if (lastIndex <= 10) for (i <- 1 to lastIndex) print(i)

  val colorPrint = (index: Int) => println(s"Printing Color Page $index.")

  val simplePrint = (index: Int) => println(s"Printing Simple Page $index.")

  println("--------------Method v1--------------")
  printPages(5, colorPrint)

  println("---------------Method v2---------------")
  printPages(2, simplePrint)
}
