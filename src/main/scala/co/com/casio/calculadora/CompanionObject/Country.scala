package co.com.casio.calculadora.CompanionObject

/**
  *
  * @param name
  * @param capital
  *
  * Los companionObjects deben ser definidos en el mismo archivo fuente y consisten en clases que contienen el
  * mismo nombre que su objecto companion. Son Singleton con utilidades de la clase como clases abstractas en java;
  * cada vez que vemos que nuestra clase tiene algo en particular que hacer, creamos un companionObject que funciona con el apply metodo
  * por defecto; como las clases utilitarias.
  */

  class Country(val name: String, val capital: String){

    var populationMap = scala.collection.mutable.Map[String, Double]()
    def getPopulation(year: String): Double = populationMap(year) //In Million
    override def toString: String = s"Country($name,$capital)"

  }

  object Country {
    /*
    * Function takes a sequence of population per million and returns average.
    * */

    def populationAverage(pops: Seq[Double]) = pops.sum / pops.length

  }
  object CountryApp extends App {


    val country = new Country("France", "Paris")
    country.populationMap += ("2015" -> 64.39) += ("2016" -> 64.67) += ("2017" -> 64.93)
    println(s"Country Name: ${country.name} and Population 2017: ${country.getPopulation("2017")} million")
    println(s"${country.name}'s average population: ${Country.populationAverage(country.populationMap.values.toSeq)}")
  }


