class Transaction(private val id: String, private val symbol: String, private val quantity: Int, private var price: Double)  extends EquityTrade(id, symbol, quantity, price) with FeePayable with Taxable {
  override def fee: Double = 10.00
  override def tax(): Double = (this.value + fee) * 0.125

  def amount:Double = (this.value + fee) + tax()
}
