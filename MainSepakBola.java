/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SepakBola;

/**
 *
 * @author Obne
 */
import java.util.ArrayList;

public class MainSepakBola {
    public static void main(String[] args) {

        ArrayList<Pemain> daftarPemain = new ArrayList<>();

        daftarPemain.add(new Kiper("Tibhaut Zahir", 1, 90));
        daftarPemain.add(new Penyerang("Lamine Aldo", 9, 160));
        daftarPemain.add(new Gelandang("Sergio Yossi", 8, 70));

        TimSepakBola tim = new TimSepakBola();

        System.out.println("=========== DATA PEMAIN ===========");

        for (Pemain p : daftarPemain) {
            tim.tampilPeran(p); 
        }
    }
}