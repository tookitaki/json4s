package com.tookitaki.json4s.ext

import com.tookitaki.json4s.Serialization

class JacksonTypeFieldSerializerSpec extends TypeFieldSerializerSpec("Jackson") {
  val s: Serialization = jackson.Serialization
}
