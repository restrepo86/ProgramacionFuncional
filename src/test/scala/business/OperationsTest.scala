package business

import org.scalatest._

class OperationsTest extends FlatSpec {


  "the test" should "return true with an even entry" in {

    val number = 10
    assert(Operations.isItEven(number) == true)

  }

  "the test" should "return false with an odd entry" in {

    val number = 11
    assert(Operations.isItEven(number) == false)

  }

  "the test" should "return true with negative even number" in {

    val number = -8
    assert(Operations.isItEven(number) == true)

  }

  "the test" should "return false with a negative odd number" in {

    val number = -1
    assert(Operations.isItEven(number) == false)

  }




}
