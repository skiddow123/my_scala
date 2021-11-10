
import org.scalatest.funsuite.AnyFunSuite

class TransactionTest extends AnyFunSuite {
  test("amount method of Transaction class"){
    val eTrade = new Transaction("APL12", "APPL",1, 100)
    assert(eTrade.amount === 123.75)
  }
}
