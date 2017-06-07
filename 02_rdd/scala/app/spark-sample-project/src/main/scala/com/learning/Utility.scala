package com.learning

class Utility extends java.io.Serializable{
  def even(a: Int): Boolean = {
    val b = a %2 ==0
    return b
  }

  def odd(a: Int): Boolean = {
    val b = a %2 ==0
    return b
  }

  def mutlt(a:Int):Int = {
    val b = a*a
    return b
  }
}
