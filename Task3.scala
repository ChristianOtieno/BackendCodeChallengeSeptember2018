case class Person(firstName: String, lastName: Int)
object Test2 extends App {
    def matchType(x: Any): String = x match {
      //case x: List(1, _*) => s"$x"          // doesn't compile
      case x @ List(1, _*) => s"$x"           // works; prints the list
      //case Some(_) => "got a Some"          // works, but can't access the Some
      //case Some(x) => s"$x"                 // works, returns "foo"
      case x @ Some(_) => s"$x"               // works, returns "Some(foo)"
      case p @ Person(first, "Otieno") => s"$p"  // works, returns "Person(Christian,Otieno)"
  }
  println(matchType(List(1,2,3)))             // prints "List(1, 2, 3)"
  println(matchType(Some("foo")))             // prints "Some(foo)"
  println(matchType(Person("Christian","Otieno")))   // prints "Person(Christian,Otieno)"
}