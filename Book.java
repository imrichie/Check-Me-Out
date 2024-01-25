// import statements
import java.util.ArrayList;
import java.util.Scanner;

// Book class definition
public class Book {
  // instance variables
  private String title;
  private String author;
  private String publisher;
  private String ISBN;

  // constructor - takes in title, author, publisher, and ISBN
  public Book(String title, String author, String publisher, String ISBN) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.ISBN = ISBN;
  }

  // getters and setters
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
}
