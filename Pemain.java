/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SepakBola;

/**
 *
 * @author Obne
 */
public class Pemain {
    protected String nama;
    protected int nomor;

    public Pemain(String nama, int nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }

    public void tampilData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Nomor : " + nomor);
    }
}