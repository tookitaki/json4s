package com.tookitaki.json4s.ext

class JacksonURLSerializerSpec extends URLSerializerSpec("Jackson") {
  val s: Serialization = jackson.Serialization
}
