package main.scala.proxy.protectedproxy

/**
  * Created by anaraynen on 25/04/2017.
  */
trait Staff {
  def isOwner(): Boolean
  def setReportGenerator(reportGenerator: ReportGeneratorProxy): Unit
}
