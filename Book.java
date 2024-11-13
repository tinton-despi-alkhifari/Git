
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanOOP;

/**
 *
 * @author Tinton Despi
 */
import java.util.ArrayList;

public class Book extends Library {
    private String bookName;
    private int bookID;
    private String penulis;
    private boolean available = true;

    
    public Book(String libraryName, String libraryAddress, String bookName, int bookID, String penulis) {
        super(libraryName, libraryAddress);
        this.bookName = bookName;
        this.bookID = bookID;
        this.penulis = penulis;
    }

    
    public String getBookName() {
        return this.bookName;
    }

    
    public String getPenulis() {
        return this.penulis;
    }

    
    public boolean isAvailable() { 
        return available;
    }

    
    public void setAvailable(boolean available) { 
        this.available = available;
    }

    public void addBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }
        books.add(book);
    }

    @Override
    public void addbook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
