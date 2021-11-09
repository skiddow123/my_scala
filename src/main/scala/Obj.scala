////object Obj {
////  def main(args: Array[String]): Unit ={
////    print(celsiusToFahrenheit(30) + " Fahrenheit" )
////  }
////
////    def celsiusToFahrenheit(c: Double): Double = {
////      (c * 9 / 5) + 32
////  }
////}
//
//object Obj2{
//    def main(args: Array[String]): Unit ={
//      print(changeDateFormat("01/02/15"))
//    }
//
//  def changeDateFormat(date: String) = {
////    val dd = date.split("/")
////val dd = date.substring()
//
//    val day = date.substring(0,2) match {
//      case "01" | "21" | "31" => s"${date.substring(0,1)}st"
//      case "02" | "22"      => s"${date.substring(0,1)}nd"
//      case "03" | "23"      => s"${date.substring(0,1)}rd"
//      case _           => s"${date.substring(0,1)}th"
//    }
//
////    val month = date.substring(3,4) match {
////      case "01" => "January"
////      case "02" => "February"
////      case "03" => "March"
////      case "40" => "April"
////      case "05" => "May"
////      case "06" => "June"
////      case "07" => "July"
////      case "08" => "August"
////      case "09" => "September"
////      case "10" => "October"
////      case "11" => "November"
////      case "12" => "December"
////    }
//
//    val year = "20" + date.substring(6,7)
////    s"${day} ${month} ${year}"
//    s"${day} ${year}"
//  }
//}
