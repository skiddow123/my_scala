import org.scalatest.funsuite.AnyFunSuite

class TradeTest extends AnyFunSuite{
  test("value method of Trade class"){
    val trade = new EquityTrade("APL12", "APPL", 24, 35.00)
//    assert(trade.value === 840.0)
  }
}

