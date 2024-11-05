

class FooSpec extends munit.FunSuite {
  test("equals") {
   assert(Foo.foo(5) == "5")
  }

  test("not equals") {
    assert(Foo.foo(6) == "idkBar(6)")
  }
}
