public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String alamat; // New field for address

    // Constructor
    public LibraryMember(String name, int memberId, String alamat) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Getter for alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter for alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void borrowBook(Book book);

    // Method to return a book without late fee calculation
    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println(getName() + " has returned the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " Semua Tersedia");
        }
    }
}
