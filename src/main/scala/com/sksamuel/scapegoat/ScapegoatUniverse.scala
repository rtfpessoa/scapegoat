package com.sksamuel.scapegoat

import scala.reflect.api.Universe

/** @author Stephen Samuel */
trait ScapegoatUniverse {
  val universe: Universe = scala.reflect.runtime.universe
  def traverser(reporter: Reporter): universe.Traverser
}