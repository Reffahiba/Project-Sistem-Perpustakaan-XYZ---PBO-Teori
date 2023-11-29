package classdiagrampbo;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Notifikasi {
    private TransaksiPeminjaman transaksi;
    private AnggotaPerpustakaan anggota;
    private String pemberitahuan;
    private Date waktu;
    private Buku buku;

    public Notifikasi(TransaksiPeminjaman transaksi, AnggotaPerpustakaan anggota, Buku buku) {
        this.transaksi = transaksi;
	this.anggota = anggota;
	this.buku = buku;
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
            System.out.println("[PESAN MASUK]");
            System.out.println("Penerima: " + this.anggota.getNama());
            System.out.println("No Telepon : " + this.anggota.getNo_telpon());
            System.out.println("Pesan: \nBatas peminjaman buku " + this.buku.getJudul() +  " tinggal " + this.calculateDuration() + " hari");
            System.out.println("anda dapat mengembalikan buku tersebut dalam 1x24 jam kedepan");
	}else if(this.calculateDuration() < 0){
            System.out.println("Kena Denda");
        }
    }
}
