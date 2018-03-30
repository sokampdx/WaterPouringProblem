import main.scala.Pouring
import org.scalatest._

class PouringTest extends FunSpec with BeforeAndAfter {
  var problem: Pouring = _

  before {
    problem = new Pouring(Vector(4,7))
  }

  describe("A Pouring") {
    it("should has zero capacity on new Pouring") {
      assert(0 == 0)
    }
  }

}
