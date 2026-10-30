package com.tookitaki.shaded.org.json4s.reflect

import java.lang.reflect.ParameterizedType

case class TypeInfo(clazz: Class[_], parameterizedType: Option[ParameterizedType])
