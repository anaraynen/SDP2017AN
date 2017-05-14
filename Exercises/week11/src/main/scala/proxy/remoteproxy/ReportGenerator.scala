package main.scala.proxy.remoteproxy

import java.rmi.Remote
import java.rmi.RemoteException
/**
  * Created by anaraynen on 25/04/2017.
  */

trait ReportGenerator extends Remote {
  @throws(classOf[RemoteException])
  def generateDailyReport(): String


}