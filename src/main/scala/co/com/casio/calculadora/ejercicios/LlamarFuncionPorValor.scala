package co.com.casio.calculadora.ejercicios

/**
  * Las LLLAMADAS POR VALOR son las que utilizamos normalmente,
  * consisten en que damos valores como argumentos que se sustituyen
  * en la funcion por valores de parametros.
  */

object LlamarFuncionPorValor extends App {

  def compareIntegers (valor1: Int, valor2: Int): Int = {

    if (valor1 == valor2) 0 else if (valor1 > valor2) 1 else -1

  }

  println(compareIntegers(1, 2))
}
