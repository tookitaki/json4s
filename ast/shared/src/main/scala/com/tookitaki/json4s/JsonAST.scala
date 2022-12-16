/*
 * Copyright 2009-2011 WorldWide Conferencing, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tookitaki.json4s

object JsonAST {

  /**
   * Concatenates a sequence of <code>JValue</code>s.
   * <p>
   * Example:<pre>
   * concat(JInt(1), JInt(2)) == JArray(List(JInt(1), JInt(2)))
   * </pre>
   */
  def concat(xs: JValue*): JValue = xs.foldLeft(JNothing: JValue)(_ ++ _)

  type JValue = com.tookitaki.json4s.JValue
  val JNothing = com.tookitaki.json4s.JNothing
  val JNull = com.tookitaki.json4s.JNull
  type JString = com.tookitaki.json4s.JString
  val JString = com.tookitaki.json4s.JString
  type JDouble = com.tookitaki.json4s.JDouble
  val JDouble = com.tookitaki.json4s.JDouble
  type JDecimal = com.tookitaki.json4s.JDecimal
  val JDecimal = com.tookitaki.json4s.JDecimal
  type JLong = com.tookitaki.json4s.JLong
  val JLong = com.tookitaki.json4s.JLong
  type JInt = com.tookitaki.json4s.JInt
  val JInt = com.tookitaki.json4s.JInt
  type JBool = com.tookitaki.json4s.JBool
  val JBool = com.tookitaki.json4s.JBool
  type JField = (String, JValue)
  val JField = com.tookitaki.json4s.JField
  type JObject = com.tookitaki.json4s.JObject
  val JObject = com.tookitaki.json4s.JObject
  type JArray = com.tookitaki.json4s.JArray
  val JArray = com.tookitaki.json4s.JArray
  type JSet = com.tookitaki.json4s.JSet
  val JSet = com.tookitaki.json4s.JSet
}