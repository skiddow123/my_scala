object Monday extends App {
  println("Hello Monday")
  val order: String = "A glass of beer"
  println(order.matches(".* beer"))
  println(order.matches(".* glass"))

  val order2: String = "A glass of coke - I like beer in the morning"
//  println(order2.replaceAll("[bB]eer", "coke"))
//  println(order2.replaceFirst("[bB]eer", "coke"))

  val drink = raw".* (glass|bottle) of (beer|wine|coke) - I like beer in the (morning|afternoon).*".r
  val drink (yourAmount,yourDrink,time) = order2
  println(yourAmount)
  println(yourDrink)
  println(time)
  println(abs(2))
  println(month(42))
  println("=======================================")

  for (a <-1 to 5) println(a)

  println("=======================================")
  1 to 5 foreach(println(_))

  def abs(a: Int) = if (a>=0) {a} else {-a}

  def month(numOfDays: Int) = {
    numOfDays match {
      case 4 | 6 | 9 | 11 =>println("30 ddays")
      case 2 => println("28 or 29")
      case b if (b > 12) => print("herh stop fooling")
      case _ => println("31 days")
    }
  }
}
