package kotlinOOPS

fun main() {
    val paperBook = BorrowableBook("1984", "George Orwell")
    val digitalBook = EBook("Clean Code", "Robert C. Martin", 5.5)

    println(paperBook.getDetails())
    paperBook.borrow("Alice")
    println(paperBook.getDetails())
    paperBook.returnBook()
    println(paperBook.getDetails())

    println(digitalBook.getDetails())
}
