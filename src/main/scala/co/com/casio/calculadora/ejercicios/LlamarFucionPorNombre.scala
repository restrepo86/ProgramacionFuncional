package co.com.casio.calculadora.ejercicios

/**
  * En la firma de la funcion eliminamos el () parentesis y añadimos =>
  * , lo que hace que nuestro codigo comprenda que esto es un parametro
  * POR NOMBRE, y que lo evalue solo cuando se lo llama.
   */



object LlamarFucionPorNombre extends App {

  val printerSwitch = false;

  def printPages(doc: Document, lastIndex: Int, print: (Int) => Unit, isPrinterOn: => Boolean) = {
    if (lastIndex <= doc.numOfPages && isPrinterOn) for (i <- 1 to lastIndex) print(i)
  }

  val colorPrint = (index: Int) => {
    println(s"Printing Color Page $index.")
  }

  println("-----------------------Method V1-----------------------")
  printPages(Document(15, "DOCXS"), 2, colorPrint, !printerSwitch)

}

case class Document(numOfPages: Int, typeOfDoc: String)