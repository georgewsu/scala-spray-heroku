package com.georgewsu.scalasprayheroku

import akka.actor.Actor
import spray.http.MediaTypes._
import spray.routing._

class MainServiceActor extends Actor with MainService {

  def actorRefFactory = context

  def receive = runRoute(mainRoute)

}

trait MainService extends HttpService {

  val mainRoute =
    path("") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            <html>
              <title>Scala Spray Heroku</title>
              <body>
              </body>
            </html>
          }
        }
      }
    }

}