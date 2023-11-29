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
public class TransaksiPengembalian extends TransaksiPeminjaman {

    public TransaksiPengembalian(String id_transaksi, Date tanggal_awal, Date tanggal_akhir, Date durasi, AnggotaPerpustakaan anggota) {
        super(id_transaksi, tanggal_awal, tanggal_akhir, durasi, anggota);
    }
    
}
