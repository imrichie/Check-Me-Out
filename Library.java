// import statements
import java.util.ArrayList;
import java.util.List;

// Library class definition
public class Library {
  // list of books in the library
  private List<Book> libraryList;

  // constructor - takes in a list of books
  public Library(List<Book> bookList) {
    libraryList = new ArrayList<>(bookList);
  }

  // constructor - takes in no parameters and creates sample library
  public Library() {
    // initialize the list of books
    libraryList = new ArrayList<>();
  }

  // getters and setters
  public void addBook(Book book) {
    libraryList.add(book);
    System.out.println(
      "*** Success: The book " +
      book.getTitle() +
      " has been added to the library ***"
    );
  }

  // remove a book from the library
  public void removeBook(Book book) {
    libraryList.remove(book);
  }

  // remove a book by title
  public void removeBookByTitle(String title) {
    // variable to store the book to remove
    Book bookToRemove = null;
    // loop through the list of books to find the book to remove
    for (Book book : libraryList) {
      if (book.getTitle().equals(title)) {
        bookToRemove = book;
      }
    }
    // if the book is found, remove it from the list
    if (bookToRemove != null) {
      libraryList.remove(bookToRemove);
      System.out.println(
        "*** Success: The book " +
        title +
        " has been removed from the library ***"
      );
    } else {
      System.out.println(
        "*** Sorry, it seems that book is not in the library ***"
      );
    }
  }

  public List<Book> getLibraryList() {
    return libraryList;
  }

  // print the list of books in the library
  public void printLibraryList() {
    System.out.println(
      "*** There is currently " +
      libraryList.size() +
      " books in your library *** "
    );
    for (Book book : libraryList) {
      System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
    }
  }

  // get a book by its title
  public Book getBookByTitle(String title) {
    for (Book book : libraryList) {
      if (book.getTitle().equals(title)) {
        return book;
      }
    }
    return null;
  }

  // create sample Library
  public void createSampleLibrary() {
    Book book1 = new Book(
      "November 9th",
      "Colleen Hoover",
      "Autria Books",
      "1501110349"
    );
    libraryList.add(book1);

    Book book2 = new Book(
      "Reminders of Him",
      "Colleen Hoover",
      "Montlake Books",
      "1542025605"
    );
    libraryList.add(book2);
  }
}
