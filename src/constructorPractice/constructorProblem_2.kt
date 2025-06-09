/*
Challenge: StudentRegistry with List of Students
📋 Requirements
You're building a Student Registry System. Here's what you need to do:

🔹 Part 1: Student Class
Use what you’ve already learned to create the Student class with:
name: String
rollNumber: Int
email: String? (optional)
age: Int? (optional)

Constructors:
Primary constructor: Accepts only name and rollNumber

Secondary constructor: Accepts email and age, with:

Email must contain @
Age must be in range 5..100

🔹 Part 2: StudentRegistry Class
Create another class StudentRegistry that:

Has a property: val students = mutableListOf<Student>()
Has a function addStudent(...) which:
Takes student details as arguments.
Adds the student to the list using the correct constructor.

Has a function printAllStudents() that prints all valid students in the list with:
text
Copy
Edit
Name: Ravi, Roll: 101, Email: ravi@example.com, Age: 22
If email or age is missing, just show "N/A" for those fields.
 */


package constructorPractice

fun main() {
    val registry = StudentRegistry()

    registry.addStudent("Ravi", 101)
    registry.addStudent("Sita", 102, "sita@example.com", 21)
    registry.addStudent("Ram", 103, "invalidemail", 12)
    registry.addStudent("Gita", 104, "gita@example.com", 150)

    registry.printAllStudents()
}

class StudentRegistry {
    val students = mutableListOf<Student>()

    fun addStudent(name: String, rollNumber: Int) {
        val student = Student(name, rollNumber)
        students.add(student)
    }
    fun addStudent(name:String, rollNumber: Int, email: String, age: Int) {
        val student = Student(name, rollNumber, email, age)
        students.add(student)
    }
    fun printAllStudents() {
        for (student in students) {
            println("Name: ${student.name}, Roll: ${student.rollNumber}, Email: ${student.email ?: "N/A"}, Age: ${student.age ?: "N/A"}")
        }
    }
}

