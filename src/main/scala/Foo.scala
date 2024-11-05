import sttp.tapir.Schema

case class Bar(x: Int)


object Foo {
  def foo(x: Int): String = {
    val bar = Bar(x)
    if (x == 5) "5" else "idk" + bar.toString
  }

  implicit val schema: Schema[Bar] = Schema.derived
}
