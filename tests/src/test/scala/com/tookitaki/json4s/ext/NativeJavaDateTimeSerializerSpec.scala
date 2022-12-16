package com.tookitaki.json4s.ext

import com.tookitaki.json4s.Serialization

class NativeJavaDateTimeSerializerSpec extends JavaDateTimeSerializerSpec("Native") {
  val s: Serialization = com.tookitaki.json4s.native.Serialization
}
