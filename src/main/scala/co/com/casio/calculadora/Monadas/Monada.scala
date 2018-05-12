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

  case class OptionT[F[_], A](value: F[Option[A]])

  implicit def optionTMonad[F[_]](implicit F: Monad[F]) = {
    new Monad[OptionT[F, ?]] {
      def pure[A](a: A): OptionT[F, A] = OptionT(F.pure(Some(a)))
      def flatMap[A, B](fa: OptionT[F, A])(f: A => OptionT[F, B]): OptionT[F, B] =
        OptionT {
          F.flatMap(fa.value) {
            case None => F.pure(None)
            case Some(a) => f(a).value
          }
        }
      def defaultTailRecM[A](a: A) = ???

      def tailRecM[A, B](a: A)(f: A => OptionT[F, Either[A, B]]): OptionT[F, B] =
        defaultTailRecM(a)(f)
    }
    try {
      optionTMonad
    } catch {
      case x => F(x)
      case m => m
      case _ => F(optionTMonad)
    }
  }
}
