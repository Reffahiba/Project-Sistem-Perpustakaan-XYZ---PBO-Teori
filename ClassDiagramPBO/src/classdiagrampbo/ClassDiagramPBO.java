/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classdiagrampbo;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ACER
 */
public class ClassDiagramPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin admin = new Admin("ID01", "Rehan");
        AnggotaPerpustakaan ap1 = new AnggotaPerpustakaan("IDA001", "Reffa", "082178424252");
        AnggotaPerpustakaan ap2 = new AnggotaPerpustakaan("IDA002", "Rifandi", "08219812302");
        TransaksiPeminjaman tpin1 = new TransaksiPeminjaman("TP001", new Date(123,10,28) ,new Date(123,10,29) ,new Date() , ap1);
        TransaksiPengembalian tkem1 = new TransaksiPengembalian(tpin1);
        Buku buku1 = new Buku("Matahari", "Aziz", "ISBN001", "Romance", true);
        Buku buku2 = new Buku("Bulan", "Mulhadi", "ISBN002", "Fantasy", true);
        
        ArrayList<AnggotaPerpustakaan> ap = admin.getAnggota();
        ArrayList<Buku> bk = admin.getDaftarBuku();
        ArrayList<TransaksiPeminjaman> tpin = admin.getTransaksi_peminjaman();
        admin.addAnggota(ap1); // Metode untuk menambahkan data anggota ke dalam sistem
        admin.addAnggota(ap2); // Metode untuk menambahkan data anggota ke dalam sistem
        admin.addBuku(buku1); // Metode untuk menambahkan data buku ke dalam sistem 
        admin.addBuku(buku2); // Metode untuk menambahkan data buku ke dalam sistem
        admin.displayAnggota(); // Metode untuk menampilkan data anggota yang tersimpan
        admin.displayBuku(); // Metode untuk menampilkan data buku yang tersimpan
        admin.setTransaksi_peminjaman(tpin1); // Metode untuk membuat transaksi peminjaman 
        admin.setTransaksi_pengembalian(tkem1); // Metode untuk membuat transaksi pengembalian
        System.out.println();
        admin.displayAktivitasAnggota(ap1); // Metode untuk menampilkan aktivitas yang dilakukan oleh anggota
        
        System.out.println();
        // Metode searchBuku
        ap.get(0).searchBuku("Matahari", admin);
        System.out.println("================================================\n");
        // Metode pinjamBuku
        ap.get(0).pinjamBuku(bk.get(0), tpin1);
        System.out.println("Ketersediaan buku judul " + bk.get(0).getJudul() + " : " + bk.get(0).isIsAvailable());
        System.out.println("================================================\n");
        // Metode restoreBuku
        ap.get(0).restoreBuku(bk.get(0), tkem1);
        System.out.println("Ketersediaan buku judul " + bk.get(0).getJudul() + " : " + bk.get(0).isIsAvailable());
        System.out.println("================================================\n");
        
        ap.get(0).pinjamBuku(bk.get(0), tpin1);
        System.out.println();
        Notifikasi n1 = new Notifikasi(tpin.get(0), ap.get(0), bk.get(0));
        n1.calculateDuration();
        n1.pemberitahuan();
    }
}
