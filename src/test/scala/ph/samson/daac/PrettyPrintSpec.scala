package ph.samson.daac

import org.scalatest.flatspec.AnyFlatSpec
import ph.samson.daac.Main.prettyPrint

import java.util.concurrent.TimeUnit

class PrettyPrintSpec extends AnyFlatSpec {

  "prettyPrint" should "format nanos" in {
    assert(prettyPrint(100) == "100 nanoseconds")
  }

  it should "format millis" in {
    assert(prettyPrint(999_999_999) == "999 milliseconds")
  }

  it should "format seconds" in {
    assert(prettyPrint(9_999_999_999L) == "9 seconds")
  }

  it should "format minutes" in {
    assert(prettyPrint(130_000_000_000L) == "2 minutes and 10 seconds")
  }

  it should "format hours" in {
    assert(
      prettyPrint(8_356_000_000_000L) ==
        "2 hours, 19 minutes, and 16 seconds"
    )
  }
}
