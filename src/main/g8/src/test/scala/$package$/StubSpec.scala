package $package$

import org.scalatest._
import flatspec.AnyFlatSpec
import matchers.should._
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class StubSpec extends AnyFlatSpec
  with Matchers
  with ScalaCheckPropertyChecks {

  "foo" should "return 7 times n" in {
    forAll { i: Int =>
      val s = Stub(i)
      s.foo shouldBe (7 * i)
    }
  }
}
