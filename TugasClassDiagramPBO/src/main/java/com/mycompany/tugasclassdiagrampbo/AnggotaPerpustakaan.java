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
public class AnggotaPerpustakaan {
    private String id_anggota;
    private String nama;
    private String no_telpon;
    private ArrayList<TransaksiPeminjaman> transaksi_peminjaman = new ArrayList<>();
    private ArrayList<Buku> buku = new ArrayList<>();
    private Notifikasi notifikasi;

    public AnggotaPerpustakaan(String id_anggota, String nama, String no_telpon, Notifikasi notifikasi) {
        this.id_anggota = id_anggota;
        this.nama = nama;
        this.no_telpon = no_telpon;
        this.notifikasi = notifikasi;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public ArrayList<TransaksiPeminjaman> getTransaksi_peminjaman() {
        return transaksi_peminjaman;
    }

    public ArrayList<Buku> getBuku() {
        return buku;
    }

    public Notifikasi getNotifikasi() {
        return notifikasi;
    }
}
