package co.com.casio.calculadora.CaseClases


/**
  * Cuando definimos nuestra case class, el compilados de scala crea automaticamente su objeto complementario con algunos
  * metodos, como apply, toString, equals, hashCode, unapply, copy, canEqual etc... El compilador de scala cada vez que encuentra una case class
  * lo convierte a una clase java CaseClass.class, CaseClass$.class.
  * LOS CASE CLASS SIEMPRE SE DEFINEN CON PARAMETROS INMUTABLES POR DEFECTO, ENTONCES NO ES NECESARIO USAR LA PALABRA
  * RESERVADA VAL PARA DEFINIRLOS COMO EN EL SIGUIENTE EJEMPLO.
  */

case class Country (name: String, capital: String)

object CountryUtil extends App {

  val country = Country("France", "Paris")
  println(s"Our country is: $country")
  println(s"Equality => ${country == country}")
  println(s"HashCode for country instance: ${country.hashCode()}")
  println(s"Country: => $country")
  println(s"Equality: => ${country == country}")
  println(s"HashCode: => ${country.hashCode()}")
  println(s"Unapply: => ${Country.unapply(country)}")
  println(s"apply: => ${Country.apply("Germany","Berlin")}")
  println(s"copy: => ${country.copy("Germany","Berlin")}")
  println(s"copyName: => ${country.copy(name="Germany")}")
  println(s"copyCapital: => ${country.copy(capital="Berlin")}")
  println(s"productArity: => ${country.productArity}")
  println(s"productPrefix: => ${country.productPrefix}")
  println(s"productElement(0): => ${country.productElement(0)}")
  println(s"productElement(1): => ${country.productElement(1)}")

  /**
    * Es muy util y recomendado utilizar paternMacthing cuando se trabaja con case class en scala asi:
    */
  country match {
    case Country ("Alemania", _) => println (s"Es Alemania")
    case Country ( "France", _) => println (s"It's France")
    case Country (_, _) => println (s"It is some country")
  }


  /**
    * OJO => Scala no permite crear una class y una case class con el mismo nombre en el mismo ambito.
    */
  // ASÍ SI =>

  /**
    * object CountryUtil extends App {
    *   case class País (nombre: String, capital: String)
    *   val country = País ("France", "Paris")
    * }
    * class País (nombre: String, capital: String)
    */

  // ASÍ NO =>

  /**
    * case class Country(name: String, capital: String)
    * object CountryUtil extends App {
    *   val country = Country("France", "Paris")
    * }
    * class Country(name: String, capital: String)
    */

}




