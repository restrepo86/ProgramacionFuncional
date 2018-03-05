val x = 5



case class A(a: Int, b: Int)

  A(1, 2).copy(a = 1, b = 1)




val aa = A(1, 2)
aa.copy(a = aa.a + 1, b = aa.b + 1)


//con parraler match

aa match  {
  case A(a, b) => A(a+1, b+1)
}

// Listas (Elem :: (Elem :: NIL))
// NIL => Es un elemento vacío

List(1,2,3,4) match {
  case cabeza :: Nil => cabeza + 1
  case cabeza :: cola => cabeza + 1
  case Nil => 0
}

// Sumarle uno a un elemento de la lista

List(1,2,3,4) match {
  case cabeza :: Nil => (cabeza + 1) :: Nil
  case cabeza :: cola => (cabeza + 1) :: cola
  case _ => 0
}

// Sumarle uno a todos los elemetos de la lista

def add(l: List[Int]): List[Int] = {
  l match {
    case cabeza :: Nil => (cabeza + 1) :: Nil
    case cabeza :: cola => (cabeza + 1) :: add(cola)
    case Nil => Nil
  }
}

add(1::2::3::4::Nil)

/* Para que sea una funcion que no se desborde en la pila se debe
recordar que el retorno debe ser el llamado recursivo a la funcion.
NO DEBE HACER NADA MAS
*/
import com.sun.net.httpserver.Authenticator
import com.sun.net.httpserver.Authenticator.Success

import scala.annotation.tailrec
import scala.util.Try
def addElem(list: List[Int]): List[Int] = {
  @tailrec
  def addLoop(elem: List[Int], acc: List[Int]): List[Int] = {
    elem match {
      case head :: Nil => (head + 1) +: acc
      case head :: cola => addLoop(cola, acc :+ (head + 1))
        //(head + 1) :: add(cola)
      case Nil => Nil
    }
  }
  addLoop(list, Nil)
}

/*
para sacar el promedio de una lista de manera recursiva sin
desbordamiento de pila
*/

def promedioLista(list: List[Int]):Double = {

  @tailrec
  def addLoop(elem: List[Int], acc: Double, size: Double): Double = {
    elem match {
      case head :: Nil => (head + acc) / size
      case head :: cola => addLoop( cola, head + acc, size + 1)
      case Nil => acc / size
    }

  }
  addLoop(list, 0D, 0D)


}
promedioLista(1::2::3::4::Nil)

// tipos y herencia con Options

case class Mensaje(texto: String, sha: Int)
object Mensaje {
  def apply(texto: String, sha: Int): Option[Mensaje] = {
    if (validarSha ( sha )) Option(new Mensaje ( texto, sha ))
    else None
  }


  private def validarSha(sha: Int): Boolean = ???
}

//Option tipos

Option(null)
val s: Option[Int] = Option(1)


s.map(_ + 1)

s.map(identity)
s.map{case x if x > 0 => "hola"}


val d: Option[Int] = Option(2)


d.map(_ * 2)

//El flapMap() me obliga a mandarle nuevamente un
// Option encapsulado

d.flatMap(x => Option(x * 2))

d.getOrElse(0)
// Suma de dos Option
val i: Option[Int] = Option(2)
val y: Option[Int] = Option(1)

for {
  ss <- s
  dd <- d
} yield ss + dd


// Try Con base a la presencia o no de una excepcion

import scala.util.Try
import scala.util.{Success, Failure}

Try[Int](1)
Success(1)
Failure(new Exception)


Try[Int](throw new Exception("Error"))
Success(1)
Failure(new Exception)










