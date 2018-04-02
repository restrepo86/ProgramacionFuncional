package co.com.casio.calculadora.ejercicios

import scala.collection.immutable.Stack

/**
  * Son colecciones con el ultimo en entrar pimero en salir, y son inmutables por lo que no cambian la
  * pila original.
  */

object ImmutableStack extends App {

  val stack = Stack(1, 2, 3)

  val stackPush = stack.push(4)
  println(s"La nueva variablePila con el item 4 stack.push(4) es: ${stackPush}")


  val stackPop = stackPush.pop
  println(s"con el metodo stack.pop resulta el numero que entro de ultimo asi: $stackPop")


}
