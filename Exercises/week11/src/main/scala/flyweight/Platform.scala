package main.scala.flyweight

/**
  * Created by anaraynen on 25/04/2017.
  */
trait Platform {
  def execute(code: Code): Unit
}