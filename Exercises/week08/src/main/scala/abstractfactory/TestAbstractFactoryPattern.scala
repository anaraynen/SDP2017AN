package main.scala.abstractfactory

import main.scala.abstractfactory.parsers.XMLParser
/**
  * Created by anaraynen on 05/03/2017.
  */

object TestAbstractFactoryPattern {
  def main(args: Array[String]) {

    var parserFactory: AbstractParserFactory = ParserFactoryProducer.getFactory("NYCFactory")
    var parser: XMLParser = parserFactory.getParserInstance("NYCORDER")
    var msg: String = ""
    msg = parser.parse
    println(msg)
    println("************************************")
    parserFactory = ParserFactoryProducer.getFactory("LondonFactory")
    parser = parserFactory.getParserInstance("LondonFEEDBACK")
    msg = parser.parse
    println(msg)

  }
}
