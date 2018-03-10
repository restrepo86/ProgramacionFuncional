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


val iteratorForStocks = stocks.iterator
while (iteratorForStocks.hasNext) println(iteratorForStocks.next())

val iteratorForMarcasCarros = marcasCarros.iterator
while (iteratorForMarcasCarros.hasNext) println(iteratorForMarcasCarros.next())

val iteratorForPersonas = personas.iterator
while (iteratorForPersonas.hasNext) println(iteratorForPersonas.next())

val mesesDelAno = List("Enero", "Febrero", "Marzo", "Abril", "Mayo")
val iteratorMesesDelAno = mesesDelAno.iterator
while (iteratorMesesDelAno.hasNext) println(iteratorMesesDelAno.next())
mesesDelAno.foreach(mesDelAno => println(mesDelAno))
for (mesDelAno <- mesesDelAno ) println(mesDelAno)















