package $package$

import org.scalacheck.Gen
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class StubSpec extends FlatSpec
  with Matchers
  with ScalaCheckDrivenPropertyChecks {

  "foo" should "return 7 times n" in {
    forAll { i: Int =>
      val s = Stub(i)
      s.foo shouldBe (7 * i)
    }
  }
}
