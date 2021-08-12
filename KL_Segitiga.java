
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
public class KL_Segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        double a, b, c, alas, tinggi, keliling, luas;

        System.out.println("=============== KELILING & LUAS SEGITIGA ===============\n\n");
        System.out.println("1. Keliling Segitiga\n2. Luas Segitiga\n\n");
        System.out.print("Inputkan Nomor Menu            = ");
        menu = sc.nextInt();
        System.out.println("");

        switch (menu){
            case 1:
                System.out.print("Inputkan Sisi Pertama Segitiga = ");
                a = sc.nextDouble();
                System.out.print("Inputkan Sisi Kedua Segitiga   = ");
                b = sc.nextDouble();
                System.out.print("Inputkan Sisi Ketiga Segitiga  = ");
                c = sc.nextDouble();
                keliling = a + b + c;
                System.out.println("\nKeliling Segitiga              = " + keliling);
                break;
            case 2:
                System.out.print("Inputkan Alas Segitiga         = ");
                alas = sc.nextDouble();
                System.out.print("Inputkan Tinggi Segitiga       = ");
                tinggi = sc.nextDouble();
                luas = 0.5 * (alas * tinggi);
                System.out.println("\nLuas Segitiga                  = " + luas);
                break;
            default:
                System.out.println("Input Salah");
        }
    }
}
