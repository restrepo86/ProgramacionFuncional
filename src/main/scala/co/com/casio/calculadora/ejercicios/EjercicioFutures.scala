package co.com.casio.calculadora.ejercicios

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object SumaEnteros extends  App {



    val numero1 = Future(5)
    println("numero1")
    val numero2 = Future(2)
    println("numero2")
    val numero3 = Future(10)
    println("numero3")

    println("definiendoSuma...")
    def sumarFuturos(a: Future[Int], b: Future[Int], c: Future[Int]) = Await.result(a, 0.seconds) + Await.result(b, 0.seconds) + Await.result(c, 0.seconds)

    println("Sumando")
    println(sumarFuturos(numero1, numero2, numero3))



}
