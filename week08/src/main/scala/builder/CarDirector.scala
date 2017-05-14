package main.scala.builder

/**
  * Created by anaraynen on 07/03/2017.
  *//**
  * Created by anaraynen on 07/03/2017.
  */
case class CarDirector (carBuilder: CarBuilder) {


  def build: Car ={

    carBuilder.buildBodyStyle()
    carBuilder.buildBreaks()
    carBuilder.buildEngine()
    carBuilder.buildFuelType()
    carBuilder.buildPower()
    carBuilder.buildSeats()
    carBuilder.buildWindows()

    carBuilder.getCar

  }

}