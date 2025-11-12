// LibraryBook.java
class LibraryBook {
    String title;
    String author;
    int bookID;

    // Constructor using 'this' keyword
    LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    // Method to display book information
    void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
        System.out.println();
    }
}

// Main class
public class LibraryMain {
    public static void main(String[] args) {
        // Create book objects
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 101);
        LibraryBook book2 = new LibraryBook("Harry Potter", "J.K. Rowling", 102);

        // Display their information
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}

