public class LibrarySystem {
    private Book[] books;

    public LibrarySystem() {
        // Initialize the array of books
        books = new Book[] {
            new Book("Dilan 1991", "Pidi Baiq"),
            new Book("Pangeran Biru", "Kakang"),
            new Book("Suatu Penantian", "Hj.Babah"),
            new Book("Kami Bersamamu", "Jimmy Smith")
        };
    }

    // Method to borrow a book by index
    public void borrowBook(LibraryMember member, int bookIndex) {
        if (bookIndex >= 0 && bookIndex < books.length) {
            member.borrowBook(books[bookIndex]);
        } else {
            System.out.println("Indeks Buku Invalid");
        }
    }

    // Method to return a book by index
    public void returnBook(LibraryMember member, int bookIndex) {
        if (bookIndex >= 0 && bookIndex < books.length) {
            member.returnBook(books[bookIndex]);
        } else {
            System.out.println("Indeks Buku Invalid");
        }
    }

    // Method to display the status of all books
    public void displayBooksStatus() {
        System.out.println("\nCurrent Books Status:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + (book.isAvailable() ? "Tersedia" : "Sudah Dipinjam"));
        }
    }
}