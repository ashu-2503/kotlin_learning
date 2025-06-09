/*
Challenge: Enhanced Student Class

🧾 Requirements:
You need to create a class Student that supports:

Primary constructor for:
name: String
rollNumber: Int

Secondary constructor that also accepts:
email: String
age: Int

In the secondary constructor, perform the following validations:
Email must contain @
Age must be >= 5 and <= 100

If either email or age is invalid:
Skip assigning them
Print a message like Invalid email or Invalid age
Use null as the default for unassigned fields like email and age.
*/

package constructorPractice

fun main() {
    val s1 = Student("Shashi", 101)
    val s2 = Student("Udit", 102, "udit@gmail.com", 27)
    val s3 = Student("Amit", 103, "amit@gmail.com", 3)
}

class Student {
    var name: String
    var rollNumber: Int
    var email: String? = null
    var age: Int? = null

    constructor(name: String, rollNumber: Int) {
        this.name = name
        this.rollNumber = rollNumber
        println("Student with name : $name and roll: $rollNumber is created")
    }

    constructor(name: String, rollNumber: Int, email: String, age: Int) : this(name, rollNumber) {
        if (email.contains("@") && age >= 5 && age <= 100) {
            this.email = email
            this.age = age
            println("Student with name : $name and roll: $rollNumber have email : $email and age : $age")
        } else {
            println("Student with name : $name and roll: $rollNumber have wrong email : $email or age : $age")
        }
    }
}