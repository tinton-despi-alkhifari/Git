public class Student extends LibraryMember {
    private String nim; // New field for student ID number

    // Constructor
    public Student(String name, int memberId, String nim) {
        super(name, memberId, nim);
        this.nim = nim;
    }

    // Getter for nim
    public String getNim() {
        return nim;
    }

    // Setter for nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Student) with NIM " + nim + " has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}
