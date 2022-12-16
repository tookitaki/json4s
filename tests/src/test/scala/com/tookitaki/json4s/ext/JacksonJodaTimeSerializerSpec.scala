package com.tookitaki.json4s.ext

class JacksonJodaTimeSerializerSpec extends JodaTimeSerializerSpec("Jackson") {
  val s: Serialization = jackson.Serialization
  val m: JsonMethods[_] = jackson.JsonMethods
}
