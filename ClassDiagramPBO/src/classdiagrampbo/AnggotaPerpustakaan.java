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
public class AnggotaPerpustakaan {
    private String id_anggota;
    private String nama;
    private String no_telpon;
    private ArrayList<TransaksiPeminjaman> transaksi_peminjaman = new ArrayList<>();
    private ArrayList<Buku> buku = new ArrayList<>();

    public AnggotaPerpustakaan(String id_anggota, String nama, String no_telpon) {
        this.id_anggota = id_anggota;
        this.nama = nama;
        this.no_telpon = no_telpon;
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


    
    public void pinjamBuku(Buku buku){
        if(buku.isIsAvailable()){
            this.getBuku().add(buku);
            buku.setIsAvailable(false);
            System.out.println("Pinjam Buku Berhasil");
            return;
        }

        System.out.println("Buku tidak tersedia");
    }
    public void searchBuku(String cari, Admin a){
        for(Buku i : a.getDaftarBuku() ){
            if(i.getJudul().equals(cari)){
                System.out.println("Nama Buku : " + i.getJudul());
                System.out.println("ISBN : " + i.getNo_isbn());
                System.out.println("Pengarang " + i.getPengarang());
                System.out.println("Genre " + i.getGenre());
                System.out.println("Tersedia :  " +  (i.isIsAvailable() ? "Ada" : "Tidak Ada"));
                return;
            }    
        }

    }
    public void restoreBuku(Buku buku, TransaksiPengembalian tpeng){
        if(!buku.isIsAvailable()){
            this.getBuku().remove(buku);
            buku.setIsAvailable(true);
            System.out.println("Pengembalian Buku Berhasil");
            return;
        }

        System.out.println("Buku tidak tersedia");
    }
}
