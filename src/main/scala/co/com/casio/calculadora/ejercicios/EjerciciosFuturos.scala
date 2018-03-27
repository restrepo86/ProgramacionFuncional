package co.com.casio.calculadora.ejercicios

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object EjerciciosFuturos extends App {

  case class Usuario(
                    nombre: String,
                    documento: String,
                    edad: Int
                    )
  def getNombre = Option(Future("Juan Fernando"))
  def getDocumento = Option(Future("1036945309"))
  def getEdad = Option(Future(25))

  if (getNombre.nonEmpty && getEdad.nonEmpty && getDocumento.nonEmpty)
    println(Usuario.apply(Await.result(getNombre.get, 0.seconds),  Await.result(getDocumento.get, 0.seconds), Await.result(getEdad.get, 0.seconds)))


}
