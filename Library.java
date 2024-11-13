/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanOOP;
import java.util.ArrayList;

/**
 *
 * @author Tinton Despi
 */
public abstract class Library {
    private final String libraryName;
    private final String libraryAddress;
  
    
    public Library (String libraryName, String libraryAddress) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
       
    }
    public String getLibraryName(){
        return this.libraryName;
    }
    public String getLibraryAddres(){
        return this.libraryAddress;
    }
    
    ArrayList<Book> books = new ArrayList<>();
    
    public abstract void addbook(Book book);
    
}
   
    

