/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasclassdiagrampbo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class TransaksiPeminjaman {
    private String id_transaksi;
    private Date tanggal_awal;
    private Date tanggal_akhir;
    private Date durasi;
    private ArrayList<Buku> buku = new ArrayList<>();
    private AnggotaPerpustakaan anggota;

    public TransaksiPeminjaman(String id_transaksi, Date tanggal_awal, Date tanggal_akhir, Date durasi, AnggotaPerpustakaan anggota) {
        this.id_transaksi = id_transaksi;
        this.tanggal_awal = tanggal_awal;
        this.tanggal_akhir = tanggal_akhir;
        this.durasi = durasi;
        this.anggota = anggota;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public Date getTanggal_awal() {
        return tanggal_awal;
    }

    public Date getTanggal_akhir() {
        return tanggal_akhir;
    }

    public Date getDurasi() {
        return durasi;
    }

    public ArrayList<Buku> getBuku() {
        return buku;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }
    
}

