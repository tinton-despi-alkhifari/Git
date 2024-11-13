/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanOOP;

/**
 *
 * @author Tinton Despi
 */
public class Member extends Visitor {
    private final String nama;

  
    public Member(String nama, int memberID) {
        super(nama, nama, nama); 
        this.nama = nama;
    }

    
    public String getNamaMember() {
        return this.nama;
    }

    
    public void borrowBook(Book book) {
        if (book.isAvailable()) { 
            book.setAvailable(false); 
            System.out.println(getNamaMember() + " telah meminjam buku " + book.getBookName() + " di perpustakaan " + book.getLibraryName());
        } else {
            System.out.println("Buku telah dipinjam");
        }
    }

    
    public void returnBook(Book book) {
        if (!book.isAvailable()) { 
            book.setAvailable(true); 
            System.out.println(getNamaMember() + " telah mengembalikan buku: " + book.getBookName() + " di perpustakaan " + book.getLibraryName());
        }
    }
}
