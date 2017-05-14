package main.scala.strategy

/**
  * Created by anaraynen on 03/03/2017.
  */
case class LowerTextFormatter() extends TextFormatter{
  override def format(text: String): String = text.toLowerCase
}
