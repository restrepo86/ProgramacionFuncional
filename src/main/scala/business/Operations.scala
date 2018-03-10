package business

object Operations extends App{

  def isItEven(number: Int): Boolean = {
    if (number % 2 == 0) true else false

  }
  val number1: Int = 10
  val number2: Int = 11
  val number3: Int = 77
  val number4: Int = 98
  val number5: Int = 33

  println(s"$number1 is it even??? ${isItEven(number1)}")
  println(s"$number2 is it even??? ${isItEven(number2)}")
  println(s"$number3 is it even??? ${isItEven(number3)}")
  println(s"$number4 is it even??? ${isItEven(number4)}")
  println(s"$number5 is it even??? ${isItEven(number5)}")
}

