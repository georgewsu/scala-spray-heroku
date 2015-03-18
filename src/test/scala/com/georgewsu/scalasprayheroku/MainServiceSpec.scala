package com.georgewsu.scalasprayheroku

import spray.testkit.ScalatestRouteTest

class MainServiceSpec extends BaseSpec
  with ScalatestRouteTest
  with MainService {

  def actorRefFactory = system

  "Main service" should "return response for GET request to root path" in {
    Get() ~> mainRoute ~> check {
      responseAs[String] should include("Scala Spray Heroku")
    }
  }

}