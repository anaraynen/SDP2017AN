package Notifiers

import Sensors.Sensor

/**
  * Created by anaraynen on 29/01/2017.
  */
trait Notifier {

  def notify(sensor: Sensor)


}
