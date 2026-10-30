package com.tookitaki.shaded.org.json4s.ext

import com.tookitaki.shaded.org.json4s.Serialization

class NativeJavaDateTimeSerializerSpec extends JavaDateTimeSerializerSpec("Native") {
  val s: Serialization = com.tookitaki.shaded.org.json4s.native.Serialization
}
