package com.georgewsu.scalasprayheroku

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import com.typesafe.config.ConfigFactory
import spray.can.Http

import scala.concurrent.duration._

object Boot extends App {

  implicit val system = ActorSystem("on-spray-can")

  val service = system.actorOf(Props[MainServiceActor], "main-service")

  implicit val timeout = Timeout(5.seconds)

  val config = ConfigFactory.load()
  val port = config.getInt("port")

  IO(Http) ? Http.Bind(service, interface = "localhost", port = port)

}
