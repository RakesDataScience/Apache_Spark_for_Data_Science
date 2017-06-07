package com.learning

import com.learning.Utility
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.log4j.Logger
import org.apache.log4j.Level
/**
  * Created by 703182460 on 6/7/2017.
  */
object spark {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.OFF)
    val conf = new SparkConf().setAppName("Simple Application").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val utility = new Utility()
    val rdd = sc.parallelize(List(1,2,3,4,5,6,9,10))
    val evenRdd  = rdd.filter(utility.even)
    val oddRdd = rdd.filter(utility.odd)
    val evenMutlRdd = evenRdd.map(utility.mutlt)
    println("Printing even rdd")
    evenRdd.foreach(println)
    println("Printing odd rdd")
    oddRdd.foreach(println)
    println("print mutl rdd")
    evenMutlRdd.foreach(println)
  }
}
