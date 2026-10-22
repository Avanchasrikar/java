
class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    public void bookdetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println();
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book has not been issued.");
        }
    }

    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("Book is available.");
        } else {
            System.out.println("Book is not available.");
        }
    }
}

class Library {
    Book[] books;

    // Store the books array
    public void setBooks(Book[] books) {
        this.books = books;
    }

    // Search for a book using ID
    public Book searchById(int id) {
        for (Book b : books) {
            if (b.bookId == id) {
                return b;
            }
        }

        System.out.println("Book ID " + id + " not found.");
        return null;
    }

    // Search books by title
    public void searchByTitle(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.title.toLowerCase().contains(title.toLowerCase())) {
                b.bookdetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found with that title.");
        }
    }

    // Display all available books
    public void displayAvailableBooks() {
        boolean found = false;

        for (Book b : books) {
            if (b.isAvailable) {
                b.bookdetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books are available.");
        }
    }

    // Issue a book by ID
    public void issueBookById(int id) {
        Book b = searchById(id);

        if (b != null) {
            b.issueBook();
        }
    }

    // Return a book by ID
    public void returnBookById(int id) {
        Book b = searchById(id);

        if (b != null) {
            b.returnBook();
        }
    }
}

public class praticeManagement {
    public static void main(String[] args) {

        Book obj1 = new Book();
        obj1.bookId = 1;
        obj1.title = "The King of War";
        obj1.author = "Ram";
        obj1.isAvailable = true;

        Book obj2 = new Book();
        obj2.bookId = 2;
        obj2.title = "The Lost Kingdom";
        obj2.author = "Arun";
        obj2.isAvailable = false;

        Book obj3 = new Book();
        obj3.bookId = 3;
        obj3.title = "The Silent Warrior";
        obj3.author = "Rahul";
        obj3.isAvailable = true;

        Book obj4 = new Book();
        obj4.bookId = 4;
        obj4.title = "The Power of Dreams";
        obj4.author = "Kiran";
        obj4.isAvailable = false;

        Book obj5 = new Book();
        obj5.bookId = 5;
        obj5.title = "The Last Battle";
        obj5.author = "Vikram";
        obj5.isAvailable = true;

        Book[] books = {obj1, obj2, obj3, obj4, obj5};

        // Create Library without a constructor
        Library library = new Library();
        library.setBooks(books);

        System.out.println("===== ALL AVAILABLE BOOKS =====");
        library.displayAvailableBooks();

        System.out.println("===== ISSUE BOOK ID 1 =====");
        library.issueBookById(1);

        System.out.println("\n===== ISSUE BOOK ID 1 AGAIN =====");
        library.issueBookById(1);

        System.out.println("\n===== CHECK BOOK ID 1 =====");
        Book result = library.searchById(1);
        if (result != null) {
            result.checkAvailability();
        }

        System.out.println("\n===== RETURN BOOK ID 1 =====");
        library.returnBookById(1);

        System.out.println("\n===== SEARCH BY ID 3 =====");
        Book foundBook = library.searchById(3);
        if (foundBook != null) {
            foundBook.bookdetails();
        }

        System.out.println("===== SEARCH BY TITLE =====");
        library.searchByTitle("King");

        System.out.println("===== ISSUE NONEXISTENT BOOK =====");
        library.issueBookById(100);

        System.out.println("\n===== FINAL AVAILABLE BOOKS =====");
        library.displayAvailableBooks();
    }
}
