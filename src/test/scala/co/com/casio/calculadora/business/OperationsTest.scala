package co.com.casio.calculadora.business

import org.scalatest._

class OperationsTest extends FlatSpec {

  val operations = new Operations()

  "the test" should "return true with an even entry" in {

    val number = 10
    assert(operations.isItEven(number) == true)

  }

  "the test" should "return false with an odd entry" in {

    val number = 11
    assert(operations.isItEven(number) == false)

  }


}
