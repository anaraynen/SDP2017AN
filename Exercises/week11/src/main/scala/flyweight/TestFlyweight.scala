package main.scala.flyweight

/**
  * Created by anaraynen on 25/04/2017.
  */

object TestFlyweight extends App {
  var code: Code = Code("C Code...")
  var platform: Platform = PlatformFactory.getPlatformInstance("C")
  platform.execute(code)
  println("-" * 20)

  code = Code("C Code2...")
  platform = PlatformFactory.getPlatformInstance("C")
  platform.execute(code)
  println("-" * 20)

  code = Code("JAVA Code...")
  platform = PlatformFactory.getPlatformInstance("JAVA")
  platform.execute(code)
  println("-" * 20)

  code = Code("JAVA Code2...")
  platform = PlatformFactory.getPlatformInstance("JAVA")
  platform.execute(code)
  println("-" * 20)

  code = Code("RUBY Code...")
  platform = PlatformFactory.getPlatformInstance("RUBY")
  platform.execute(code)
  println("-" * 20)

  code = Code("RUBY Code2...")
  platform = PlatformFactory.getPlatformInstance("RUBY")
  platform.execute(code)
}