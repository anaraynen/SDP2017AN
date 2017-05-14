package main.scala.interpreter

/**
  * Created by anaraynen on 23/04/2017.
  */
class Number(private val n: Int) extends Expression {
  override def interpret(): Int = n
}
