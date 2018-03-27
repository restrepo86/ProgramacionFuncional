package co.com.casio.calculadora.ejercicios

object FilterFunction extends App {

  val names = List("Alicia", "Allen", "Bob", "Catherine", "Alex")
  println(s"La lista contiene los nombres $names")

  val namesStarWithA = names.filter((name) => name.startsWith("A"))
  println(s"Los nombres de la lista names que empiezan por A son $namesStarWithA")

  // Refactor de namesStarWithA segun el compilador de scala
  val namesStarWthAOptimized = names.filter(_.startsWith("A"))
  println(assert(namesStarWithA == namesStarWthAOptimized))
}
