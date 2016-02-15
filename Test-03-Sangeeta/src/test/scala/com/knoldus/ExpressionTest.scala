package com.knoldus
import org.scalatest.FunSuite
/**
  * Created by knodus on 15/2/16.
  */
class ExpressionTest extends FunSuite{

  val exp=new Expression
  test("Expression: "){
    val result=exp.evaluateResult("1+2*3+6-2")
    assert(11==result)
  }

}
