import javax.swing.text.Document

val stocks = List("APL", "GOOG", "JLR", "TESLA")
stocks.foreach(stock => println(stock))

for (stock <- stocks if stock.length > 3) println(stock)

val personas = List("Juan", "Pedro", "Ana")
for (persona <- personas) println(persona)
personas.foreach(persona => println(s"Buenos Dias $persona"))


val marcasCarros = List("Mazda", "MercedesBenz", "Toyota")
for (marcaCarro <- marcasCarros if marcaCarro == "Mazda") println(marcaCarro)

marcasCarros.foreach(marcaCarro => print(s"La Mejor Marca es ${marcaCarro} "))







