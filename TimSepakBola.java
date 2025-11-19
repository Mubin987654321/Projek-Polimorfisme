/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SepakBola;

/**
 *
 * @author Obne
 */
public class TimSepakBola {

    public void tampilPeran(Pemain pemain) {

        pemain.tampilData(); 

        if (pemain instanceof Kiper) {
            ((Kiper) pemain).tangkapBola();

        } else if (pemain instanceof Penyerang) {
            ((Penyerang) pemain).cetakGol();

        } else if (pemain instanceof Gelandang) {
            ((Gelandang) pemain).umpan();
        }

        System.out.println("-------------------------------------");
    }
}