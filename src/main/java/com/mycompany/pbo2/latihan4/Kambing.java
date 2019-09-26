/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan4;

/**
 *
 * @author 
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : PBO2
 * NIM      : 10118069
 * Deskripsi program : Program ini berisi program untuk menghitung jumlah kambing
 * 
 */
public class Kambing {
    public void tambahKambing() {
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}
