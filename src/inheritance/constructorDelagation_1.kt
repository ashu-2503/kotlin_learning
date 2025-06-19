/*
Scenario: Employees in a Company
You are building a simple HR system with two classes:
Employee (base class)
Manager (derived class)

Every employee has:
name
employeeId

A manager also has:
department

We’ll use constructor delegation so that Manager can reuse Employee logic.
*/

package inheritance

open class Employee(val name : String, val employeeId: String){
    init {
        println("Employee Created - Name: $name, ID: $employeeId")
    }
}

class Manager (name : String, id : String, val department : String): Employee ( name,id){
    fun showInfo(){
        println("Manager of $department department")
    }
}

fun main(){
    val Manager1 = Employee("Ashutosh","101")
    val Manager2 = Manager("Raj","102","HR")

    Manager2.showInfo()
}