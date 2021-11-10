class FXTrade(private val id: String, private var price: Double) extends Trade(id,price){
  override def executeTrade(): Boolean = false
}
