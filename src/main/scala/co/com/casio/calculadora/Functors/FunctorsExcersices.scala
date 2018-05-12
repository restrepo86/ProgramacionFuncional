package co.com.casio.calculadora.Functors
import cats._
import cats.implicits._
object FunctorExercises extends App {

  def apply[F: Semigroup]: Semigroup[F] = implicitly[Semigroup[F]]
  def func(number: Int, numberTwo: Int): Some[Int] =  Some(number + numberTwo)

  println(func(1, 1))

  def function(number: Int, numberTwo: Int) = {
    Semigroup[Option[Int]].combine(Option(number), None)
  }

  println(function(1, 1))


}