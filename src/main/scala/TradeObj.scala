object TradeObj extends App {
  val trade = new Trade("APL12", "APPL", 24, 35.00)
  println(trade)
  println(trade._price)
  trade.price_(99.00)
  println(trade._price)
}
