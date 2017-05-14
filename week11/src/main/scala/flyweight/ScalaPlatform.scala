package main.scala.flyweight

/**
  * Created by anaraynen on 25/04/2017.
  */
class ScalaPlatform extends Platform {

  println("ScalaPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Scala code.")
}