public class Lecture extends LibraryMember {
    private String kodeDosen; // New field for teacher code

    // Constructor
    public Lecture(String name, int memberId, String kodeDosen) {
        super(name, memberId, kodeDosen);
        this.kodeDosen = kodeDosen;
    }

    // Getter for kodeDosen
    public String getKodeDosen() {
        return kodeDosen;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Teacher) with Kode Dosen " + kodeDosen + " has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Maaf, " + book.getTitle() + " Tidak Tersedia");
        }
    }
}