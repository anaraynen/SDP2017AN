package main.scala.proxy.virtualproxy

import scala.collection.mutable.ListBuffer

/**
  * Created by anaraynen on 25/04/2017.
  */

trait ContactList {
  def employeeList: ListBuffer[Employee]
}
