package com.knoldus

/**
  * Created by knodus on 15/2/16.
  */

class Stack[T]{

  def push[T](list:List[T],element:T):List[T]={
    list match{
      case head::tail => list :+ element
      case _ => List(element)
    }
  }

  def peek[T](list:List[T]):T=list.last

  def pop[T](list:List[T]):List[T]=list.init

}



class Expression {

  def getPrecedence(operator:Char): Int={
    if( operator=='/' )
      4
    else if(operator== '*')
      3
    else if(operator== '+')
      2
    else
      1
  }

  def evaluateResult(str:String): Unit ={

    val operatorStack=new Stack[Char]
    val numberStack=new Stack[Int]
    val numberList=str.split("[*/+-]").toList
    val operatorList=str.split("[0-9]+").toList

    for(i<-str){
      if(i.isDigit){
        numberStack.push(List(),i)

      }
      else{
        operatorStack.push(List(),i)

      }
    }



  }

}
