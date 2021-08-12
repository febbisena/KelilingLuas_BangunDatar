
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class KL_PersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int panjang, lebar, keliling, luas;
        
        System.out.println("========== KELILING & LUAS PERSEGI PANJANG ==========\n\n");
        System.out.print("Masukkan panjang persegi panjang   = ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar persegi panjang     = ");
        lebar = sc.nextInt();
        System.out.println("");
        
        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;
        
        System.out.println("Keliling Persegi Panjang           = " +keliling);
        System.out.println("Luas Persegi Panjang               = " +luas);
    }
}
