abstract class Trade(private val id: String,private val symbol: String, private val quantity: Int, private var price: Double) {
  def _id: String = id
  def _symbol: String = symbol
  def _quantity: Int = quantity
  def _price: Double = price

  def this(id: String, symbol: String, quantity: Int){
    this(id,symbol,quantity,price = 0.0)
  }

  def setPrice (newPrice: Double): Unit = {
    if(newPrice > 0 ){
      price = newPrice
    }else{
      println("price can't be negative")
    }
  }

  def value:Double = quantity.*(price)

//  override def toString = s"id: $id"
}

//object Trade{
//  def apply(id: String, symbol: String, quantity: Int, price: Double): Trade = new Trade(id, symbol, quantity, price)
//}

  def executeTrade():Unit


//class Point {
//  private var _x = 0
//  private var _y = 0
//  private val bound = 100
//
//  def x = _x
//  def x_= (newValue: Int): Unit = {
//    if (newValue < bound) _x = newValue else printWarning
//  }
//
//  def y = _y
//  def y_= (newValue: Int): Unit = {
//    if (newValue < bound) _y = newValue else printWarning
//  }
//
//  private def printWarning = println("WARNING: Out of bounds")
//}