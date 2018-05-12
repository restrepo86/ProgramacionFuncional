package co.com.casio.calculadora.Monadas

import scala.util.Try

object Monad {

  import cats._


  implicit def optionMonad(implicit app: Applicative[Option]) =
    new Monad[Option] {

      override def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] =
        app.map(fa)(f).flatten
      override def pure[A](a: A): Option[A] = app.pure(a)

      override def tailRecM[A, B](a: A)(f: A => Option[Either[A, B]]): Option[B] = ???

      Monad[Option].asInstanceOf[Option]
    }


  type either[A] = Either[String, A]
  implicit def eitherMonad = new Monad[either] {
    def pure[A]: A => Either[_, A] = Right._
    def flapMap[A, B](fa: either[A])
                     (f:A => either[B]): either[B] = fa flatMap f
  }

  implicit def tryMonad = new Monad[Try] {
    def pure[A]: A => Try[A] = Right._
    def flapMap[A, B](fa: Try[A])
                     (f:A => Try[B]): Try[B] = fa flatMap f
  }

  implicit def tryMonad = new Monad[Try] {
    def pure[A]: A => Try[A] = Right._
    def flapMap[A, B](fa: Try[A])
                     (f:A => Try[B]): Try[B] = fa flatMap f
  }

  

}
