package com.tookitaki.shaded.org.json4s.ext

import com.tookitaki.shaded.org.json4s.Serialization

class JacksonJavaDateTimeSerializerSpec extends JavaDateTimeSerializerSpec("Jackson") {
  val s: Serialization = com.tookitaki.shaded.org.json4s.jackson.Serialization
}
