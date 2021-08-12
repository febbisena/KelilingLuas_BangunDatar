
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
public class KL_BelahKetupat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        double s, d1, d2, keliling, luas;

        System.out.println("========= KELILING & LUAS BELAH KETUPAT =========\n\n");
        System.out.println("1. Keliling Belah Ketupat\n2. Luas Belah Ketupat\n\n");
        System.out.print("Inputkan Nomor Menu        = ");
        menu = sc.nextInt();
        System.out.println("");

    switch(menu){
        case 1:
            System.out.print("Inputkan Sisi Belah Ketupat    = ");
            s = sc.nextDouble();
            keliling = 4 * s;
            System.out.println("\nKeliling Belah Ketupat         = " +keliling);
            break;
        case 2:
            System.out.print("Inputkan Diagonal Pertama Belah Ketupat    = ");
            d1 = sc.nextDouble();
            System.out.print("Inputkan Diagonal Kedua Belah Ketupat      = ");
            d2 = sc.nextDouble();
            luas = 0.5 * d1 * d2;
            System.out.println("\nLuas Belah Ketupat                         = " +luas);
            break;
        default:
            System.out.println("Input Salah");
        }
    }
}
