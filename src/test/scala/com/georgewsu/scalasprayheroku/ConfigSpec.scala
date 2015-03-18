package com.georgewsu.scalasprayheroku

import com.typesafe.config.ConfigFactory

class ConfigSpec extends BaseSpec {

  "Config" should "read port value" in {
    val config = ConfigFactory.load()
    val port = config.getInt("port")
    port should be (8080)
  }

}
