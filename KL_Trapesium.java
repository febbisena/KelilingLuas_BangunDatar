
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
public class KL_Trapesium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        double a, b, c, d, s_atas, s_bawah, tinggi, keliling, luas;
        
        System.out.println("=============== KELILING & LUAS TRAPESIUM ===============\n\n");
        System.out.println("1. Keliling Trapesium\n2. Luas Trapesium\n\n");
        System.out.print("Inputkan Nomor Menu            = ");
        menu = sc.nextInt();
        System.out.println("");
        
        switch(menu){
            case 1:
                System.out.print("Inputkan Sisi Pertama Trapesium = ");
                a = sc.nextDouble();
                System.out.print("Inputkan Sisi Kedua Trapesium   = ");
                b = sc.nextDouble();
                System.out.print("Inputkan Sisi Ketiga Trapesium  = ");
                c = sc.nextDouble();
                System.out.print("Inputkan Sisi Keempat Trapesium = ");
                d = sc.nextDouble();
                keliling = a + b + c + d;
                System.out.println("\nKeliling Trapesium              = " +keliling);
                break;
            case 2:
                System.out.print("Inputkan Sisi Atas Trapesium    = ");
                s_atas = sc.nextDouble();
                System.out.print("Inputkan Sisi Bawah Trapesium   = ");
                s_bawah = sc.nextDouble();
                System.out.print("Inputkan Tinggi Trapesium       = ");
                tinggi = sc.nextDouble();
                luas = 0.5 * ((s_atas + s_bawah) * tinggi);
                System.out.println("\nLuas Trapesium                  = " +luas);
                break;
            default:
                System.out.println("Input Salah");
        }
    }
}
