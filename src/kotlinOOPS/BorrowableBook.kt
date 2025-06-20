package kotlinOOPS

class BorrowableBook(
    title: String,
    author: String
) : Book(title, author), Borrowable {
    private var borrowedBy: String? =null

    override fun borrow(user: String) {
        borrowedBy = user
            println("Book is borrowed by $user()")
    }

    override fun returnBook() {
        println("Book is returned by $borrowedBy")
        borrowedBy = null
    }

    override fun getDetails(): String {
        return super.getDetails() + ", Borrowed By : ${borrowedBy ?: "Available"}"
    }
}