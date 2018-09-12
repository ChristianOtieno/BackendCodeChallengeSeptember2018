scala> val numPattern = "[0-9]+".r
numPattern: scala.util.matching.Regex = [0-9]+

scala> val address = "7th floor Galana plaza, Kilimani"
address: String = 7 floor Galana plaza, Kilimani

scala> val match1 = numPattern.findFirstIn(address)
match1: Option[String] = Some(7)

scala> match1.foreach { e =>
     |   println(s"Found a match: $e")
     | }