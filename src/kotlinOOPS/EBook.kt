package kotlinOOPS

// Inheritance
class EBook(
    title : String ,
    author : String,
    private val fileSizeMb: Double) : Book( title, author){
    override fun getDetails(): String {
        return super.getDetails() + ", File Size : $fileSizeMb MB"
    }
}