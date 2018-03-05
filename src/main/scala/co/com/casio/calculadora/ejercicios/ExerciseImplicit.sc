/* Clase Persona y metodo para sumarle un  numero
del prametro a a la edad de la clase persona
*/

case class Persona(nombre: String, edad: Int) {}

implicit def fPersona: Persona => Int = _.edad
def sum(a: Int)(implicit b: Int): Int = a + b

implicit val i: Int = Persona("Persona", 21)
// le suma 2 a la edad en la siguiente funcion
sum(2)


// Agregar funciones donde no existian

// De manera normal se haría asi

def tamString(firstText: String, secondText: String): Boolean = {
  firstText.length > secondText.length
}

tamString("hola", "ho")

// de manera impĺicita se haria asi

implicit class StringOps(s: String){
  def esMayor(s2: String): Boolean = s.length >= s2.length
}

"hola" esMayor "mundo"

//def sum[T](a: T, b: T): T = ???
//vamos a crear una caracteristica de cosas que se puedan sumar

trait Sumable[T] {
  def sumar(a: T, b: T): T
  def zero: T
}

object SumableOps {
  implicit object IntSumable extends Sumable[Int] {
    override def sumar(a: Int, b: Int): Int = a + b
    override def zero: Int = 0
  }

  implicit object StringSumable extends Sumable[String] {
    override def sumar(a: String, b: String): String = a + b
    override def zero: String = ""
  }
}

import SumableOps._

def sum[T](a: T, b: T)(implicit s: Sumable[T]): T = s.sumar(a, b)
sum("2", "3")
sum(2, 3)









