package io.lamma

import io.lamma.Anchor.{OtherDate, PeriodStart, PeriodEnd}
import io.lamma.Anchors._
import org.scalatest.{Matchers, FlatSpec}

class AnchorsSpec extends FlatSpec with Matchers {

  "periodEnd" should "be the same as lamma version" in {
    periodEnd() should be(PeriodEnd)
  }

  "periodStart" should "be the same as lamma version" in {
    periodStart() should be(PeriodStart)
  }

  "otherDate" should "be the same as lamma version" in {
    otherDate("SomeDate") should be(OtherDate("SomeDate"))
  }

}
