object TradeObj extends App {
//  val eTrade = new EquityTrade("APL12", "APPL", 24, 35.00)
//  val fTrade = new FXTrade("SMG", 35.00)
//  println(eTrade)
//  println("************************************")
//  println(fTrade)

  val eTrade = new Transaction("APL12", "APPL",1, 100)
  println(eTrade.amount)



//  val tradeCopyg = tradeWithCompanionObject.copy(id = "APL21")
//  println(tradeCopyg)
//  println(trade._price)
//  trade.price_(99.00)
//  println(trade._price)
}
