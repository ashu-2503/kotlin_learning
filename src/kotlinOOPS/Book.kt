package kotlinOOPS

//Encapsulation
open class Book(private val title:String, private val author : String) {
    open fun getDetails() : String{
        return "Title : $title , Author : $author"
    }
}