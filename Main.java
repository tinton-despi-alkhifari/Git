/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanOOP;

/**
 *
 * @author Tinton Despi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Book book1 = new Book("Ruang Baca", "Gedung B Lt.2", "Tutorial Sholat", 12, "Tinton Despi");
    Book book2 = new Book("Ruang Baca", "Gedung B Lt.2", "Kisah Nabi", 3, "Alkhifari");

    
    Visitor visit1 = new Visitor("Ruang Baca", "Gedung B Lt.2", "Hanif");

    Member member1 = new Member("Ihsan", 3);
    Member member2 = new Member("Sahrul", 2);

    
    visit1.viewBook(book2);       
    member1.borrowBook(book1);    
    member2.borrowBook(book1);    
    visit1.viewBook(book1);      
    }
}  
