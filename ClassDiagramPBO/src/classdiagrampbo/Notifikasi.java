/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagrampbo;

import java.util.Date;
import java.util.concurrent.TimeUnit;

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





public int calculateDuration() {
    Date awal = transaksi.getTanggal_awal();
    Date akhir = transaksi.getTanggal_akhir();
    long selisihMilidetik = akhir.getTime() - awal.getTime();
    int durasi = (int) TimeUnit.MILLISECONDS.toDays(selisihMilidetik);
    return durasi;
}

    
    public void pemberitahuan(){
        Date now = new Date();
        if(this.calculateDuration() ==1){
            System.out.println("Batas peminjaman Anda tinggal " + this.calculateDuration() + " Hari");
        }else if(this.calculateDuration() < 0){
            System.out.println("Kena Denda");
        }
    }
}
