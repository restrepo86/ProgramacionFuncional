package co.com.casio.calculadora.ejercicios

import scala.collection.immutable.Queue

/**
  * La cola es la primera en entrar en la estructura de datos, para poner y eliminar elementos en la cola tenemos dos
  * métodos enqueue y dequeue. ASI;:
  */

object ImmutableQueue extends App {

  val queue = Queue (1, 2, 3)
  println(s"Una cola de enteros queue: $queue")

  val addQueue = queue.enqueue(4)
  println(s"Agregando el item 4 a queue 'queue.enqueue(4)' asi: $addQueue")

  val suprItemQueue = queue.dequeue
  println(s"queue.dequeue devueleve el elemento eliminado, la nueva cola asi $suprItemQueue")


}
