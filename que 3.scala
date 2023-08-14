object main extends App{

  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String, change: String => String): String = {
    change(name)
  }

 
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
      val formattedName = formatNames(name) {
        case str if str.length % 2 == 0 => toUpper
        case str => toLower
      }
      println(formattedName)
    }
  }


