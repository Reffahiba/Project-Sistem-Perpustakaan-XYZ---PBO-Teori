/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasclassdiagrampbo;

/**
 *
 * @author ACER
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String no_isbn;
    private boolean isAvailable;

    public Buku(String judul, String pengarang, String no_isbn, boolean isAvailable) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.no_isbn = no_isbn;
        this.isAvailable = isAvailable;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getNo_isbn() {
        return no_isbn;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    } 
}
