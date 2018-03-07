package kata

import org.scalatest.{FlatSpec, Matchers}

class TreeMakerSpec extends FlatSpec with Matchers {

  "TreeMaker" should "draw the simplest tree" in {
    // Given
    val treeMaker = new TreeMaker(3, '#', '*')

    // When
    val tree = treeMaker.draw

    // Then
    tree shouldBe " *\n***\n###"
  }

  it should "support different characters for the base" in {
    // Given
    val treeMaker = new TreeMaker(3, '=', '*')

    // When
    val tree = treeMaker.draw

    // Then
    tree shouldBe " *\n***\n==="
  }

  it should "support different characters for the leaves" in {
    // Given
    val treeMaker = new TreeMaker(3, '=', '^')

    // When
    val tree = treeMaker.draw

    // Then
    tree shouldBe " ^\n^^^\n==="
  }

  it should "draw a larger tree" in {
    // Given
    val treeMaker = new TreeMaker(5, '=', '^')

    // When
    val tree = treeMaker.draw

    // Then
    tree shouldBe "  ^\n ^^^\n^^^^^\n ==="
  }

  it should "draw a huge tree" in {
    // Given
    val treeMaker = new TreeMaker(13, '=', '+')

    // When
    val tree = treeMaker.draw

    // Then
    tree shouldBe """      +
                    |     +++
                    |    +++++
                    |   +++++++
                    |  +++++++++
                    | +++++++++++
                    |+++++++++++++
                    |     ===""".stripMargin

  }

}