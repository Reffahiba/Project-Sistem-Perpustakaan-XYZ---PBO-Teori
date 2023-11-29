/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagrampbo;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Admin {
    private ArrayList<AnggotaPerpustakaan> anggota = new ArrayList<>();
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<TransaksiPeminjaman> transaksi_peminjaman = new ArrayList<>();
    private ArrayList<TransaksiPengembalian> transaksi_pengembalian = new ArrayList<>();
    private String id_admin;
    private String name_admin;

    public void addAnggota(AnggotaPerpustakaan anggota) {
        this.anggota.add(anggota);
    }

    public void setTransaksi_peminjaman(TransaksiPeminjaman transaksi_peminjaman) {
        this.transaksi_peminjaman.add(transaksi_peminjaman);
    }

    public void setTransaksi_pengembalian(TransaksiPengembalian transaksi_pengembalian) {
        this.transaksi_pengembalian.add(transaksi_pengembalian);
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public void setName_admin(String name_admin) {
        this.name_admin = name_admin;
    }

    public Admin(String id_admin, String name_admin) {
        this.id_admin = id_admin;
        this.name_admin = name_admin;
    }
    
    public void addBuku(Buku buku){
        daftarBuku.add(buku);
    }

    public ArrayList<AnggotaPerpustakaan> getAnggota() {
        return anggota;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public ArrayList<TransaksiPeminjaman> getTransaksi_peminjaman() {
        return transaksi_peminjaman;
    }

    public ArrayList<TransaksiPengembalian> getTransaksi_pengembalian() {
        return transaksi_pengembalian;
    }

    public String getId_admin() {
        return id_admin;
    }

    public String getName_admin() {
        return name_admin;
    }
}
