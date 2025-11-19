/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SepakBola;

/**
 *
 * @author Obne
 */
public class Kiper extends Pemain {

    private int penyelamatan;

    public Kiper(String nama, int nomor, int penyelamatan) {
        super(nama, nomor);
        this.penyelamatan = penyelamatan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Penyelamatan : " + penyelamatan);
    }

    public void tangkapBola() {
        System.out.println(nama + " melakukan penyelamatan gemilang!");
    }
}