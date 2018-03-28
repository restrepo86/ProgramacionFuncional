package co.com.casio.calculadora.ejercicios

import scala.collection.mutable

/**
  * Las listas en scala son inmutables y cada ves que se agrega
  * un elemento sobre ella se copia una nueva lista con el elemento
  * nuevo. TODAS LAS SECUENCIAS Y LOS MAPAS SON UNA PARTIAL FUNCTION
  * POR LO TANTO TAMBIEN SE VERIFICA SI ESTAN DEFINIDOS PARA
  * UN ARGUMENTO EN PARTICULAR CON EL METODO MAP.isDefinedAt(newItem)
  */

object ColeccionesInmutables extends App {

  val studentsPresent = List ("Alex", "Bob", "Chris")
  println(s"la lista es: $studentsPresent")
  /**
    * Para agregar un nuevo elemento a la lista lo hacemos de
    * la forma List[Any].::(newItem)
    */

  val newStudentsPresent = studentsPresent.::("JuanFernando")
  println(s"la nueva lista con el elemento JuanFernando agregado previamente es : $newStudentsPresent")


  /**
    * Los mapas son tambien inmutables y se pueden agregar pares
    * clave valor a ellos usando el metodo Mapa. + (clave -> valor).
    * Debemos recordar que al ser inmutable, al agregar
    * un nuevo par clave valor se crea un nuevo mapa con el
    * contenido anterior + el contenido nuevo.
    */

  val idUsersMap = Map(123 -> "Juan", 124 -> "Ana", 125 -> "Adriana")
  println(idUsersMap)

  val idUsersMapMoreNewItem = idUsersMap.+(125 -> "Catica")
  println(s"idUsersMap agregandole el nuevo elemento es: $idUsersMapMoreNewItem")


  /**
    * Streams: son flujos de operaciones perezosas inmutables que
    * nos permiten realizar multiples acciones sobre un valor
    * determinado. Se le llaman calculos perezosos porque no
    * recorren todo el flujo si no hasta el lugar donde sea necesario
    */

  val stream = Stream (1,2,3,4,5,6)
  print(stream)
  




}
