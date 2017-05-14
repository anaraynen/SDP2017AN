package main.scala.interpreter

/**
  * Created by anaraynen on 23/04/2017.
  */
class Product(private val leftExpression: Expression,
              private val rightExpression: Expression)
  extends Expression {

  override def interpret(): Int =
    leftExpression.interpret() * rightExpression.interpret()
}