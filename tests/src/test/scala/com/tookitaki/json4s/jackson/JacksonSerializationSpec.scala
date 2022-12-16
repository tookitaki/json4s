package com.tookitaki.json4s.jackson

class JacksonSerializationSpec
  extends SerializationSpec(
    serialization = com.tookitaki.json4s.jackson.Serialization,
    baseFormats = com.tookitaki.json4s.jackson.Serialization.formats(NoTypeHints)
  )
