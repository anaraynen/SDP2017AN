package main.scala.chain

/**
  * Created by anaraynen on 22/04/2017.
  */
trait Handler {
  def setHandler(handler: Handler)
  def process(file: File)
  def getHandlerName(): String
}