package main.scala.bridge

/**
  * Created by anaraynen on 21/04/2017.
  */
case class GearLocking(s: String) extends Product {

  override def productName: String = s

  override def produce: Unit = println("Producing " + s)
}