abstract class Trade(private val id: String, private var price: Double) {
  def _id: String = id
//  def _symbol: String = symbol
//  def _quantity: Int = quantity
  def _price: Double = price

//  def this(id: String, symbol: String, quantity: Int){
//    this(id,symbol,quantity,price = 0.0)
//  }

  def setPrice (newPrice: Double): Unit = {
    if(newPrice > 0 ){
      price = newPrice
    }else{
      println("price can't be negative")
    }
  }

  override def toString = s"" +
    s"id: $id \n" +
    s"tradeType: ${
      if (executeTrade()) {
        "EquityTrade"
      } else {
        "FxTrade"
      }
    }"

  def executeTrade():Boolean
}


//object Trade{
//  def apply(id: String, symbol: String, quantity: Int, price: Double): Trade = new Trade(id, symbol, quantity, price)
//}


