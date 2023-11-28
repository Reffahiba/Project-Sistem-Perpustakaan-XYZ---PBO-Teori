/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */


class AnggotaPerpustakaan{
    private String id_anggota;
    private String anggota;
    private String nama;
    private String no_telpon;
    private ArrayList<TransaksiPeminjaman> transaksi = new ArrayList<>();
    private ArrayList <Buku> buku = new ArrayList<>();
    private Notifikasi notifikasi ;

    public AnggotaPerpustakaan(String anggota, String nama, String no_telpon, Notifikasi notifikasi) {
        this.anggota = anggota;
        this.nama = nama;
        this.no_telpon = no_telpon;
        this.notifikasi = notifikasi;
    }

    public String getId_anggota() {
        return id_anggota;
    }
    public String getBiodata(){
                
    }
    public void pinjamBuku(ArrayList<Buku> buku){
        this.buku = buku;
    }
    public String getAnggota() {
        return anggota;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public ArrayList<TransaksiPeminjaman> getTransaksi() {
        return transaksi;
    }

    public ArrayList<Buku> getBuku() {
        return buku;
    }

    public Notifikasi getNotifikasi() {
        return notifikasi;
    }
    
    
}

class TransaksiPeminjaman{
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

class Buku{
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

class TransaksiPengembalian extends TransaksiPeminjaman{
    
    public TransaksiPengembalian(String id_transaksi, Date tanggal_awal, Date tanggal_akhir, Date durasi, AnggotaPerpustakaan anggota) {
        super(id_transaksi, tanggal_awal, tanggal_akhir, durasi, anggota);
    }   
}
class Notifikasi{
    private TransaksiPeminjaman transaksi;
    private AnggotaPerpustakaan anggota;
    private String pemberitahuan;
    private Date waktu;

    public Notifikasi(TransaksiPeminjaman transaksi) {
        this.transaksi = transaksi;
    }
    
    
      
}

class Admin{
    
}
public class Perpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
