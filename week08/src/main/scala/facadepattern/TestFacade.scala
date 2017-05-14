package main.scala.facadepattern

/**
  * Created by anaraynen on 21/04/2017.
  */
object TestFacade {
  def main(args: Array[String]) {
    val scheduleServer: ScheduleServer = ScheduleServerImpl()
    val facadeServer: ScheduleServerFacade = ScheduleServerFacade(scheduleServer)
    println("Start working......")
    facadeServer.startServer
    println("After work done.........")
    facadeServer.stopServer
  }
}
