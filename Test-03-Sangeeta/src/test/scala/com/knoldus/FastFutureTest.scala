package com.knoldus
import org.scalatest.FunSuite
import scala.concurrent.duration._

import scala.concurrent.{Future, Await}

/**
  * Created by knodus on 15/2/16.
  */
class FastFutureTest extends FunSuite {

  test("FastFuture") {
    val ff = new FastFuture
    val output = ff.firstToFinish(List(2, 3, 4))
    val res = Await.result(output, 10 second)
    assert( res===2 || res===6 || res===24)
  }
}