package com.example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.WordSpec

@RunWith(classOf[JUnitRunner])
class HelloWorldScalaTest extends WordSpec {

  "HelloWorld" should {
    "have the correct message" in {
      assert(HelloWorld.message === "Hello world!")
    }
  }
}
