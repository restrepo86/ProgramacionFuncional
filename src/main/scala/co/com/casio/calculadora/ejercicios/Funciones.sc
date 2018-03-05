def saludar(nombrePersona: String): Unit = {
  println(s"buenos dias don $nombrePersona")
}
saludar("Yosimar")

// Switch en Scala con la palabra reservada match


val mesS = 0
val mes = 1

mes match {
  case 1 => 258
  case 2 => "Febrero"
  case 3 => "Marzo"
  case 4 => "Abril"
  case 5 => "Mayo"
  case 6 => "Junio"
}


// Tambien se puede utilizar como parametro de una funcion

println(mesS match {
  case 1 => "Enero"
  case 2 => "Febrero"
  case 3 => "Marzo"
  case 4 => "Abril"
  case 5 => "Mayo"
  case 6 => "Junio"
  case _ => "Ninguno"
})



val colores = "negro"

colores match {

  case "amarillo" => "Yellow"
  case "rojo"     => "Red"
  case "azul"     => "Blue"
  case _          => "None"

}


val dias: String = "Lunes"

dias match {

  case "Lunes"     => 1
  case "Martes"    => 2
  case "Miercoles" => 3
  case "Jueves"    => 4
  case "Viernes"   => 5
  case _           => 0

}


val nombres: String = "Juan"
val resultado = nombres + 12

nombres match {

  case "Fernando" => "Restrepo"
  case "Laura"    => "Rincón"
  case "Sofia"    => "Rendon"
  case "Camila"   => "Garcia"
  case "Juan"     => "Moreno"
  case _    => "None"

}



val fechaPelicula = "1991"

fechaPelicula match {

  case "1990" => "La Guerra de las Galaxias"
  case "1991" => "Como si fuera la primera vez"
  case "1881" => "La ira de Dios"
  case "2002" => "El Todopoderoso"
  case "2000" => "Mi Pobre Angelito"
  case _      => "Ninguna"

}


val talla = "xs"

talla match {

  case "s"  => "small"
  case "xs" => "Extra Small"
  case "xl" => "Extra Large"
  case "l"  => "Large"
  case  _   => "None"
}


















