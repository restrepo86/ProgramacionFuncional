

import scala.util.{Failure, Try, Success}

// Try excepciones de objetos con java

Try[Int](throw new Exception("Error"))
Success(1)
Failure(new Exception)

Try[Int](throw new Exception("Error")).toOption
Success(1)
Failure(new Exception)


// Either manejo de errores
/*
val ll: Either[String, int] = Left("Error")

for {
  r <- Right(1)
  rl <- Right(2)
  l <- ll
} yield r+rl+l
*/

trait MensajeError{val error: String}

case class Mensaje(texto: String, sha: Int)
object Mensaje {
  def apply(texto: String, sha: Int): Either[MensajeError, Mensaje] =
    if(validarSha(sha)) Right(new Mensaje(texto, sha))
    else Left(new MensajeError {
      val error = "Bad sha"
    })
  for {
    r <- Right(1)
    rl <- Right(2)
  } yield r+rl

  }
  private def validarSha(sha: Int): Boolean = ???







