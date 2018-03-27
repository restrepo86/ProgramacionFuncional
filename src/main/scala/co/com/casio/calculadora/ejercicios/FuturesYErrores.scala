package co.com.casio.calculadora.ejercicios


import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


class FuturesYErrores  {

  val event = Future {
    Thread.sleep(scala.util.Random.nextInt(100))
    throw new Exception("Error")
  } recover  {
    case ex => s"El error es ${ex.getMessage}"
  }
  println("Principal")

  val result = Await.result(event, 2.seconds)
  println("Await")
  println(event)

  object SumaEnteros extends  App{

    val numero1 = Future(5)
    val numero2 = Future(2)
    val numero3 = Future(10)

    def sumarFuturos(a: Future[Int], b: Future[Int], c: Future[Int]) = Await.result(a, 2.seconds) + Await.result(b, 2.seconds) + Await.result(c, 2.seconds)

    println(sumarFuturos(numero1, numero2, numero3))


  }



}
