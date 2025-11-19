/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SepakBola;

/**
 *
 * @author Obne
 */
public class Penyerang extends Pemain {

    private int gol;

    public Penyerang(String nama, int nomor, int gol) {
        super(nama, nomor);
        this.gol = gol;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Gol : " + gol);
    }

    public void cetakGol() {
        System.out.println(nama + " mencetak gol spektakuler!");
    }
}