
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
public class KL_Lingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        double r, d, keliling, luas, phi = 3.14;
        
        System.out.println("=============== KELILING & LUAS LINGKARAN ===============\n\n");
        System.out.println("1. Keliling Lingkaran\n2. Luas Lingkaran\n\n");
        System.out.print("Inputkan Nomor Menu        = ");
        menu = sc.nextInt();
        System.out.println("");

        switch (menu) {
            case 1:
                System.out.print("Inputkan Diameter Lingkaran        = ");
                d = sc.nextDouble();
                keliling = phi * d;
                System.out.println("\nKeliling Lingkaran                 = " +keliling);
                break;
            case 2:
                System.out.print("Inputkan Jari-Jari Lingkaran       = ");
                r = sc.nextDouble();
                luas = phi * r * r;
                System.out.println("\nLuas Lingkaran                     = " +luas);
                break;
            default:
                System.out.println("Input Salah");
        }
    }
}
