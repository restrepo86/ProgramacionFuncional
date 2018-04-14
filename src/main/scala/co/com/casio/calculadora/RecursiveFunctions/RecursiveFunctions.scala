package co.com.casio.calculadora.RecursiveFunctions

import scala.annotation.tailrec


object RecursiveFunctions extends App {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n <= 0) prev else loop(n - 1, cur, prev + cur)

    }
    loop(n, 0, 1)
  }

  println (5 equals fib(5))

  def isSorted[A](as: Array[A], ordering: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (ordering(as(n), as(n + 1))) false
      else go(n + 1)

    go(0)
  }

   println (isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y).equals(true))

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

  def f(a: Int, b: Int): Int = a + b
  def g(a: Int)(b: Int): Int = a + b

  println((curry(f)(1)(1) == f(1, 1)).equals(true))
  println((curry(f)(1)(1) == g(1)(1)).equals(true))

  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  println(s"El maximo comun divisor de 10 y 20 es: ${gcd(10, 20)}")



}
