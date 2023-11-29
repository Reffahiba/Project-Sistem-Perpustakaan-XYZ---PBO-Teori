/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasclassdiagrampbo;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Admin {
    private AnggotaPerpustakaan anggota;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<TransaksiPeminjaman> transaksi_peminjaman = new ArrayList<>();
    private TransaksiPengembalian transaksi_pengembalian;
    private String id_admin;
    private String name_admin;

    public Admin(String id_admin, String name_admin) {
        this.id_admin = id_admin;
        this.name_admin = name_admin;
    }
    
    public void addBuku(Buku buku){
        daftarBuku.add(buku);
    }
}
