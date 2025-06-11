/*
Problem: Student ID Management System
You're building a simple system to manage student registrations.

🧩 Requirements:
Singleton:
Create a singleton IdGenerator that generates unique student IDs (e.g., STU1, STU2, …).
It must maintain an internal counter.
It should expose a method generateId() to return the next ID.

Companion Object:
Create a Student class with:
    name
    id (auto-assigned using IdGenerator.generateId())
Use a companion object to store a list of all registered students (studentRegistry) and a function printAll() to print them.

Lazy Initialization:
Inside Student, add a property called emailDomain, which should be lazily initialized to "@school.edu".
Each student should have a method getEmail() that returns ${name.lowercase()}$emailDomain.
*/


package CompanionSingletonLazyPractice

object IdGenerator {
    var count = 0
    fun generateId(): String {
        count++
        return "STU$count"
    }
}

class Student(var name: String) {
    var id = IdGenerator.generateId()
    val emailDomain: String by lazy {
        "@school.edu"
    }

    fun getEmail(): String {
        return "${name.lowercase()}$emailDomain"
    }

    companion object {
        val studentRegistry = mutableListOf<Student>()
        fun printAll() {
            for (student in studentRegistry) {
                println("Name : ${student.name}, ID : ${student.id}")
            }
        }
    }

    init {
        studentRegistry.add(this)
    }
}

fun main() {
    val s1 = Student("Ashutosh")
    val s2 = Student("Rohit")
    val s3 = Student("Sita")

    println(s1.getEmail())  // ashutosh@school.edu

    Student.printAll()
}
