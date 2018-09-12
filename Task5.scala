case class Person(name: String, age: Int)
object Test2 extends App {
    def matchType(x: Any): String = x match {
      //case x: List(1, _*) => s"$x"          // doesn't compile
      case x @ List(1, _*) => s"$x"           // works; prints the list
      //case Some(_) => "got a Some"          // works, but can't access the Some
      //case Some(x) => s"$x"                 // works, returns "foo"
      case x @ Some(_) => s"$x"               // works, returns "Some(foo)"
      case p @ Person(name, 23) => s"$p"  // works, returns "Person(Christian,23)"
  }
  println(matchType(List(1,2,3)))             // prints "List(1, 2, 3)"
  println(matchType(Some("foo")))             // prints "Some(foo)"
  println(matchType(Person("Christian", 23)))   // prints "Person(Christian,23)"
}