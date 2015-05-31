package com.example

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldSpecs2Test extends Specification {

  "HelloWorld" should {
    "have the correct message" in {
      HelloWorld.message must_== "Hello world!"
    }
  }
}
