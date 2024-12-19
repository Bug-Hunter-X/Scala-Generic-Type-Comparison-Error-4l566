```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T])(implicit ev: T =:= T): Boolean = {
    this.value == other.value
  }
}

object Main extends App {
  val obj1 = new MyClass[Int](10)
  val obj2 = new MyClass[Int](10)
  println(obj1.myMethod(obj2)) //Prints true
  
  val obj3 = new MyClass[String]("10")
  val obj4 = new MyClass[String]("10")
  println(obj3.myMethod(obj4))//Prints true
}
```