/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasclassdiagrampbo;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Notifikasi {
    private TransaksiPeminjaman transaksi;
    private AnggotaPerpustakaan anggota;
    private String pemberitahuan;
    private Date waktu;

    public Notifikasi(TransaksiPeminjaman transaksi) {
        this.transaksi = transaksi;
    }
}
