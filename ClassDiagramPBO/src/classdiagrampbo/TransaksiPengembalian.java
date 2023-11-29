/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagrampbo;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class TransaksiPengembalian extends TransaksiPeminjaman  {
    TransaksiPeminjaman tp;
    
    public TransaksiPengembalian(TransaksiPeminjaman tp) {
        this.tp = tp;
    }
    
}
