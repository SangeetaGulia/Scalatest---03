package com.knoldus

import org.scalatest.FunSuite
/**
  * Created by knodus on 15/2/16.
  */
class EmployeeTest extends FunSuite{

  val emp= new EmployeeTst

  test("Employee : sortEmployee : Empty List"){
    val result=emp.sortEmployee(List())
    assert(result === List())
  }

  test("Employee : sortEmployee : List with values"){
    val result=emp.sortEmployee(List(Employee(1,"sangeeta",20000),Employee(2,"pulkit",25000),Employee(3,"antra",18000)))
    assert(result === List(Employee(3,"antra",18000), Employee(1,"sangeeta",20000), Employee(2,"pulkit",25000)))

  }
}
