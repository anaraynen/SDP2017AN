package main.scala.mediator

/**
  * Created by anaraynen on 24/04/2017.
  */
trait Colleague {
  def setMediator(mediator: MachineMediator): Unit
}