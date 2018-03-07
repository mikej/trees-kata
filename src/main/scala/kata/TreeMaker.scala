package kata

class TreeMaker(size: Int, baseCharacter: Char, leafCharacter: Char) {

  def draw: String = {
    val leaves = (1 to size by 2).map(leafRow(_)).mkString("\n")
    s"""${leaves}\n${baseRow}"""
  }

  private def leafRow(n: Int) = {
    (" " * ((size - n) / 2)) + leafCharacter.toString * n
  }

  private def baseRow = {
    (" " * ((size - 3) / 2)) + baseCharacter.toString * 3
  }

}
