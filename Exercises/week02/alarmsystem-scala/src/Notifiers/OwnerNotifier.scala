package Notifiers
import Sensors.Sensor

/**
  * Created by anaraynen on 29/01/2017.
  */
class OwnerNotifier extends Notifier{
  override def notify(sensor: Sensor): Unit = {

    println("Calling owner...")

  }
}
