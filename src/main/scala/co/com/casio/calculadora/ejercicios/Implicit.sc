
def sumInt : Int => Int => Int = a => b => a + b
def sumString (a: String, b: String): String = a + b

// Las funciones del tipo de sumInt se llaman asi:
sumInt(2)(2)

//Para esperar un String
val s = sumString("H", _:String)

sumString("H", "O")

// implicit (mas adelante le va a llegar un valor de alguna manera)

implicit val dos: Int = 2

sumInt(2)(dos)

// funcion con implicitos

def sumIntImplicit(a: Int)(implicit b: Int): Int = a + b

//implicit val i: Int = 5

sumIntImplicit(2)

// lo anterior resulta en 7 porque el busca una variable prometida de tipo Int
// los implicitos deben esta antes del llamado a la funcion

implicit def toS: Int => String = _.toString









