object BookRecommender {

  case class Book(title: String, description: String)

  def main(args: Array[String]): Unit = {
    val books = List(
      Book("Scala for the Impatient", "Covers basics of Scala quickly"),
      Book("Programming in Scala", "In-depth Scala tutorial"),
      Book("Java Programming", "Guide to mastering Java programming")
    )

    val userPreference = "In-depth guide" 

    val recommendedBooks = recommendBooks(userPreference, books)

    println("Recommended Books:")
    recommendedBooks.foreach(book => println(book.title))
  }

  def recommendBooks(userPreference: String, books: List[Book]): List[Book] = {
    books.filter(book => book.description.contains(userPreference))
  }
}
