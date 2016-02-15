package com.knoldus
import scala.concurrent.ExecutionContext.Implicits.global


import scala.concurrent.{Promise, Future}

/**
  * Created by knodus on 15/2/16.
  */
class FastFuture {

  def factorial(num:Int):Int={
    if(num==1) 1
    else num*factorial(num-1)
  }

  def firstToFinish(ls:List[Int]):Future[Int]={
    val response:List[Future[Int]]=for( i<-ls) yield(Future {factorial(i)} )
    checkSuccess(response)
    }

  def checkSuccess(listOfFuture:List[Future[Int]]): Future[Int] ={
    val p=Promise[Int]
    listOfFuture.foreach( _.onComplete(v => p.complete(v)))
    p.future
  }

}


