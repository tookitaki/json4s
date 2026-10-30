package com.tookitaki.shaded.org.json4s
package jackson

class JacksonSerializationSpec
  extends SerializationSpec(
    serialization = com.tookitaki.shaded.org.json4s.jackson.Serialization,
    baseFormats = com.tookitaki.shaded.org.json4s.jackson.Serialization.formats(NoTypeHints)
  )
