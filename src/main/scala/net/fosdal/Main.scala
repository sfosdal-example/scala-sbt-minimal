package net.fosdal

import net.fosdal.oslo._
import net.fosdal.oslo.oduration._

object Main extends App {

  time {
    println("Hello World!")
  } { case (_, d) =>
    println(s"that took ${d.pretty}")
  }

}
