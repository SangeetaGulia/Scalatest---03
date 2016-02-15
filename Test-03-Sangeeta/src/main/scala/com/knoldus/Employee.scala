package com.knoldus

/**
  * Created by knodus on 15/2/16.
  */
case class Employee (val id:Int,val name:String,val salary:Int)

  object EmployeeOrder extends Ordering[Employee] {
    override def compare(x: Employee, y: Employee): Int = {
      x.salary compare y.salary
    }
  }

class EmployeeTst {
  def sortEmployee(listOfEmployees: List[Employee]): List[Employee] = {
    listOfEmployees.sorted(EmployeeOrder)

  }
}