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
        AnggotaPerpustakaan ap1 = new AnggotaPerpustakaan("IDA001", "Reffa", "082178");
        AnggotaPerpustakaan ap2 = new AnggotaPerpustakaan("IDA002", "Ifandi", "082198");
        TransaksiPeminjaman tp1 = new TransaksiPeminjaman("TP001", new Date(2023,11,28) ,new Date(2023,12,1) ,new Date() , ap1);
        Buku buku1 = new Buku("Matahari", "Aziz", "ISBN001", true);
        Buku buku2 = new Buku("Bulan", "Mulhadi", "ISBN002", true);
        Notifikasi n1 = new Notifikasi(tp1);
        admin.addAnggota(ap1);
        admin.addBuku(buku1);
//        System.out.println(n1.calculateDuration());
//        n1.pemberitahuan();
             
        ArrayList<AnggotaPerpustakaan> ap = admin.getAnggota();
        ArrayList<Buku> bk = admin.getDaftarBuku();
        ap.get(0).pinjamBuku(bk.get(0));
        System.out.println(buku1.isIsAvailable());
        ap.get(0).restoreBuku(bk.get(0), null);
        System.out.println(bk.get(0).isIsAvailable());
        ArrayList<Buku> b1Pin = ap.get(0).getBuku();
        for(Buku i : b1Pin){
            System.out.println(i.getJudul());
        }
        
        
    }
    
}
