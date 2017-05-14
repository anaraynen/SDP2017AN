package main.scala.singleton

/**
  * Created by anaraynen on 24/04/2017.
  */
class SingletonLazyInitiation private {
}

object SingletonLazyInitiation {

  def instance() = {
    lazy val instance = new SingletonLazyInitiation()
    def apply() = instance
  }

  val singleton = SingletonLazyInitiation.instance()

}



