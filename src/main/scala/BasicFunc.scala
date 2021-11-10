object BasicFunc extends  App{
  def operation(s: String): (Int, Int) => Int = {
    s match {
      case "add" => (a: Int, b: Int) => (a + b)
      case "subtract" => (a: Int, b: Int) => (a - b)
      case "multiply" => (a: Int, b: Int) => (a*b)
      case "power" => (a: Int, b: Int) => Math.pow(a, b).toInt
    }
  }

  val add = operation("add")
  println(add(1,2))

  val subtract = operation("subtract")
  println(subtract(11,2))

  val multiply = operation("multiply")
  println(multiply(1,2))

  val power = operation("power")
  println(power(2,2))

}
