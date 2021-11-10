class EquityTrade(private val id: String, private val symbol: String, private val quantity: Int, private var price: Double) extends Trade(id,price){
  override def executeTrade(): Boolean = true
  def value:Double = quantity.*(price)
}