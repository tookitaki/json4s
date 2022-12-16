package com.tookitaki.json4s.ext

import com.tookitaki.json4s.Serialization

class JacksonJavaDateTimeSerializerSpec extends JavaDateTimeSerializerSpec("Jackson") {
  val s: Serialization = com.tookitaki.json4s.jackson.Serialization
}
