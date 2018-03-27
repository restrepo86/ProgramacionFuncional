package co.com.casio.calculadora.ejercicios

object FuncionesParcialesCompuestas extends App {

  /**
    * Las funciones parciales compuestas definen dos metodos: orElse y andThen.
    */

  val isPrimeEligible: PartialFunction[Item, Boolean] = {
    case item => item.isPrimeEligible
  }

  val amountMoreThan500: PartialFunction[Item, Boolean] = {
    case item => item.price > 500.0
  }

  val freeDeliverable = isPrimeEligible orElse amountMoreThan500

  def deliveryCharge(item: Item): Double = if (freeDeliverable(item)) 0 else 50

  println(deliveryCharge(Item("1", "ABC KEYBOARD", 490.0, true)))
}

case class Item(id: String, name: String, price: Double, isPrimeEligible: Boolean)
