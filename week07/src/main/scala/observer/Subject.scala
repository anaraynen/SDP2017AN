package main.scala.observer

/**
  * Created by anaraynen on 25/04/2017.
  */
trait Subject {
  def subscribeObserver(observer: Observer)

  def unSubscribeObserver(observer: Observer)

  def notifyObservers()

  def subjectDetails: String
}
