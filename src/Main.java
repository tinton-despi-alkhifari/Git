public class Main {
    public static void main(String[] args) {
        // Initialize the library system with a list of books
        LibrarySystem librarySystem = new LibrarySystem();

        // Create members
        LibraryMember student = new Student("Tinton", 2002, "23552011162");
        LibraryMember teacher = new Lecture("Mr.Ikhwan", 2001, "K347786");

        // Borrow books
        librarySystem.borrowBook(student, 0); 
        librarySystem.borrowBook(teacher, 1); 

        // Return books without late fee calculation
        librarySystem.returnBook(student, 0);
        librarySystem.returnBook(teacher, 1);

        // Display all books' status
        librarySystem.displayBooksStatus();
        
        denda();
    }
    
    public static void denda(){
    System.out.println("Jika Telat mengembalikan buku akan di denda sebesar 20rb");
    }
}