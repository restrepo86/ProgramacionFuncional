package co.com.casio.calculadora.Compose

object Compose extends App {

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    a => f(g(a))

  def f(b: Int): Int = b / 2
  def g(a: Int): Int = a + 2

  println(compose(f, g)(0) == compose(g, f)(0))
  println(compose(f, g)(2))
  println(compose(g, f)(2))

}
