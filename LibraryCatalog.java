//import statements
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LibraryCatalog {
  private static final String CHECK_ME_OUT_LOGO =
    "  ________              __                        ____        __  __\n" +
    " / ____/ /_  ___  _____/ /__   ____ ___  ___     / __ \\__  __/ /_/ /\n" +
    "/ /   / __ \\/ _ \\/ ___/ //_/  / __ `__ \\/ _ \\   / / / / / / / __/ /\n" +
    "/ /___/ / / /  __/ /__/ ,<    / / / / / /  __/  / /_/ / /_/ / /_/_/\n" +
    "\\____/_/ /_/\\___/\\___/_/|_|  /_/ /_/ /_/\\___/   \\____/\\__,_/\\__(_)\n";

  public static void main(String[] args) {
    // creating a scanner object
    Scanner scnr = new Scanner(System.in);

    // creates a new library object and adds sample books to it
    Library libraryList = new Library();
    libraryList.createSampleLibrary();

    // print the logo and welcome message
    System.out.println(CHECK_ME_OUT_LOGO);
    System.out.println("Welcome to Check me Out!");

    // variable to store the user's choice
    boolean userQuit = false;

    // while loop to display the menu until the user quits
    while (!userQuit) {
      int userChoice = displayMenu(scnr);
      // switch statement to handle the user's choice
      switch (userChoice) {
        case 1:
          libraryList.printLibraryList();
          break;
        case 2:
          addBook(scnr, libraryList);
          break;
        case 3:
          removeBook(scnr, libraryList);
          break;
        case 4:
          userQuit = true;
          System.out.println("Thank you for using Check me Out! Goodbye!");
          break;
        default:
          System.out.println(
            "*** Oh no, that seems to be an invalid option. Please try again ***"
          );
          break;
      }
    }

    // close the scanner
    scnr.close();
  }

  // method for displaying the menu options
  public static int displayMenu(Scanner scnr) {
    System.out.println("\nPlease choose from the following options:");
    System.out.println("1. View the Library Catalog");
    System.out.println("2. Add a Book");
    System.out.println("3. Remove a Book");
    System.out.println("4. Exit the Program");
    System.out.print(">>> ");

    // variable to store the user's choice
    int choice = 0;
    // try-catch block to handle invalid input
    try {
      choice = scnr.nextInt();
      scnr.nextLine();
    } catch (InputMismatchException e) {
      scnr.nextLine();
    }
    return choice;
  }

  // method for adding a book to the library
  public static void addBook(Scanner scnr, Library libraryList) {
    // setting the title from user input
    System.out.println("Enter the title of the book you would like to add");
    System.out.print(">>> ");
    String userBook = scnr.nextLine();

    //setting the author from user input
    System.out.println("Enter the author of the book ");
    System.out.print(">>> ");
    String userAuthor = scnr.nextLine();

    //setting the publisher from user input
    System.out.println("Enter the publisher of the book ");
    System.out.print(">>> ");
    String userPublisher = scnr.nextLine();

    //setting the ISBN from user input
    System.out.println("Enter the ISBN of the book ");
    System.out.print(">>> ");
    String userISBN = scnr.nextLine();

    // initializing the new book and adding it to the library
    Book newBook = new Book(userBook, userAuthor, userPublisher, userISBN);
    libraryList.addBook(newBook);
  }

  // method for removing a book from the library
  public static void removeBook(Scanner scnr, Library libraryList) {
    // setting the title from user input
    System.out.println("Enter the title of the book you would like to remove");
    System.out.print(">>> ");
    String userBook = scnr.nextLine();
    libraryList.removeBookByTitle(userBook);
  }
}
