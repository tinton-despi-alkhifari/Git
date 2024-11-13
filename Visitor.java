/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanOOP;

/**
 *
 * @author Tinton Despi
 */
public class Visitor extends Library {
    private String name;

  
    public Visitor(String libraryName, String libraryAddress, String name) {
        super(libraryName, libraryAddress);
        this.name = name;
    }

   
    public String getNameVisitor() {
        return this.name;
    }

    public void addBook(Book book) {
        System.out.println("Mohon Maaf, Anda Tidak Bisa Menambahkan Buku");
    }

    
    public void viewBook(Book book) {
        if (book.isAvailable()) { 
            System.out.println("Detail Buku:");
            System.out.println("Judul: " + book.getBookName());
            System.out.println("Penulis: " + book.getPenulis());
        } else {
            System.out.println("Buku yang anda cari sedang tidak ada");
        }
    }

    @Override
    public void addbook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
