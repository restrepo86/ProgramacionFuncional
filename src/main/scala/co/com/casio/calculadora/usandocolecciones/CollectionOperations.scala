package co.com.casio.calculadora.usandocolecciones

object CollectionOperations extends App {

  val source = io.Source.fromFile("E:/Anarchy_Linux/Calculadora/ArchivoALeer.txt")
  val bufferedSourceToList: List[String] = {
    val list = source.getLines().toList
    source.close()
    list
  }

  def giveMePlayers(list: List [String]): List[Player] = list match {
    case head :: tail => tail map {line =>
      val columns = line.split((",")).map (_.trim)
      Player(columns(5),columns(6),columns(9),columns(7),columns(8),columns(10), columns(12), columns(0),columns(14))
    }
    case Nil => List[Player]()
  }

  val players = giveMePlayers(bufferedSourceToList)
  players foreach println

  def showPlayers (players: List[Player]) = players.foreach {p =>
    println(s"""Player: ${p.name}   Country: ${p.nationality}     Ranking 2016: ${p.ranking2016}


      ************************** Other Information ***********************
      Age: ${p.age} | Club: ${p.club} | Domestic League: ${p.domesticLeague}
      Raw Total: ${p.rawTotal}  | Final Score: ${p.finalScore}  | Ranking 2015: ${p.ranking2015}
      #####################################################################""")
  }
  showPlayers(players)

  /**
    * Los metodos de listas y stream takeWhile y dropWhile son utiles asi:
    * El takeWhile metodo toma la subcoleccion mas larga de elementos que
    * satisface el predicado.
    * El dropWhile metodo elimina la subcollecion mas larga de elementos que
    * satisface el predicado ASi:
    * Para listar los diez mejores jugadores (con ranking menor a 11)
    */

  val takeTop10 = players takeWhile(_.ranking2015.toInt < 11)
  println(s"LOS 10 MEJORES JUGADORES SON: ${takeTop10 foreach println}")

  /**
    * El take método selecciona los primeros nelementos de la colección
    * El drop método descarta los primeros nelementos de la colección
    * El partition método descarta los primeros 'n' elementos de la colección
    * El slice método selecciona un intervalo de elementos
    * El span método divide la colección en dos colecciones basadas en el predicado, donde no se preserva el orden de los elementos
    * El splitAt método divide una colección en una posición determinada
    */

  /**
    * Seleccione Jugadores de Alemania que tengan un ranking en el Top 50.
    */
  def playersNationalityFrance(players: List[Player]): List[Player] =  players.filter(_.nationality.equals("FRANCIA"))

  playersNationalityFrance(players) foreach println


}

case class Player (name: String, nationality: String, age: String, club: String, domesticLeague: String, rawTotal: String, finalScore: String, ranking2016: String, ranking2015: String)
