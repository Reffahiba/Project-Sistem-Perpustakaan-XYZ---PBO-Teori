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
        AnggotaPerpustakaan ap1 = new AnggotaPerpustakaan("IDA001", "Reffa", "082178570012");
        AnggotaPerpustakaan ap2 = new AnggotaPerpustakaan("IDA002", "Rifandi", "082198123026");
        TransaksiPeminjaman tp1 = new TransaksiPeminjaman("TP001", new Date(123,10,28) ,new Date(123,10,29) ,new Date() , ap1);
        TransaksiPengembalian tpengem1 = new TransaksiPengembalian(tp1);

        Buku buku1 = new Buku("Matahari", "Aziz", "ISBN001", "Romance", true);
        Buku buku2 = new Buku("Bulan", "Mulhadi", "ISBN002", "Fantasy", true);
        Notifikasi n1 = new Notifikasi(tp1);
        
        
        admin.addAnggota(ap1);
        admin.addAnggota(ap2);
        admin.addBuku(buku1);
        admin.addBuku(buku2);
        admin.setTransaksi_peminjaman(tp1);
        admin.setTransaksi_pengembalian(tpengem1);

        ArrayList<AnggotaPerpustakaan> ap = admin.getAnggota();
        ArrayList<Buku> bk = admin.getDaftarBuku();
//        System.out.println("Nama-nama anggota perpustakaan:");
//        for(AnggotaPerpustakaan i : ap){
//            System.out.println("ID Anggota  : " + i.getId_anggota());
//            System.out.println("Nama Anggota  : " + i.getNama());
//            System.out.println("No. Telpon  : " + i.getNo_telpon());
//            System.out.println("-----------------------");
//        }
//        System.out.println("\nBuku-buku yang tersedia:");
//        for(Buku j : bk){
//            System.out.println("No. ISBN  : " + j.getNo_isbn());
//            System.out.println("Judul Buku   : " + j.getJudul());
//            System.out.println("Genre Buku  : " + j.getGenre());
//            System.out.println("Nama Pengarang  : " + j.getPengarang());
//            System.out.println("-----------------------");
//        }
        
        // Metode searchBuku
        ap.get(0).searchBuku("Matahari", admin);
        System.out.println("---------------------\n");
        
        // Metode pinjamBuku
        ap.get(0).pinjamBuku(bk.get(0), tp1);
        System.out.println("Ketersediaan buku judul matahari: " + bk.get(0).isIsAvailable());
        System.out.println("---------------------\n");
        
        // Metode restoreBuku
        ap.get(0).restoreBuku(bk.get(0), tpengem1);
        System.out.println("Ketersediaan buku judul matahari: " + bk.get(0).isIsAvailable());
        

        
        
    }
    
}
