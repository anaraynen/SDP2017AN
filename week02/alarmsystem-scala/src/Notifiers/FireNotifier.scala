package Notifiers
import Sensors.Sensor

/**
  * Created by anaraynen on 29/01/2017.
  */
class FireNotifier extends Notifier{
  override def notify(sensor: Sensor): Unit = {

    println("Calling fire department for sensor " + sensor.getSensorType + " in location " + sensor.getLocation)
  }
}
