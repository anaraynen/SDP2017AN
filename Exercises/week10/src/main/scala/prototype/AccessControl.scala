package main.scala.prototype

/**
  * Created by anaraynen on 24/04/2017.
  */
class AccessControl(val controlLevel: String,
                    var access: String)
  extends Prototype {

  override def clone(): AccessControl = AccessControl.this
}
