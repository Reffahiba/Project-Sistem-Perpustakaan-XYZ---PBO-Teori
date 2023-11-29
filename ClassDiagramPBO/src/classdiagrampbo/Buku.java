/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagrampbo;

/**
 *
 * @author ACER
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String no_isbn;
    private String genre;
    private boolean isAvailable;

    public Buku(String judul, String pengarang, String no_isbn, String genre, boolean isAvailable) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.no_isbn = no_isbn;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setNo_isbn(String no_isbn) {
        this.no_isbn = no_isbn;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getNo_isbn() {
        return no_isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public boolean isIsAvailable() {
        return isAvailable;
    } 
}
