/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SepakBola;

/**
 *
 * @author Obne
 */
public class Gelandang extends Pemain {

    private int assist;

    public Gelandang(String nama, int nomor, int assist) {
        super(nama, nomor);
        this.assist = assist;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Assist : " + assist);
    }

    public void umpan() {
        System.out.println(nama + " memberikan umpan kunci!");
    }
}