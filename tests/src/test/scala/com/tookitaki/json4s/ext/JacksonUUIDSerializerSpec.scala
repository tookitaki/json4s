package com.tookitaki.json4s.ext

class JacksonUUIDSerializerSpec extends UUIDSerializerSpec("Jackson") {
  val s: Serialization = jackson.Serialization
}
