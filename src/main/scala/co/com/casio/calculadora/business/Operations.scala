package co.com.casio.calculadora.business
import scala.annotation.tailrec


class Operations {

  def isItEven(number: Int): Boolean = {
    if (number % 2 == 0) true else false

  }

  isItEven(10)
}

