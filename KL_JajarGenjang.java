
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
public class KL_JajarGenjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu, a, b, alas, tinggi, keliling, luas;
        
        System.out.println("========= KELILING & LUAS JAJAR GENJANG =========\n\n");
        System.out.println("1. Keliling Jajar Genjang\n2. Luas Jajar Genjang\n\n");
        System.out.print("Inputkan Nomor Menu            = ");
        menu = sc.nextInt();
        System.out.println("");
        
        switch(menu){
            case 1:
                System.out.print("Inputkan Sisi Pertama Jajar Genjang = ");
                a = sc.nextInt();
                System.out.print("Inputkan Sisi Kedua Jajar Genjang   = ");
                b = sc.nextInt();
                keliling = 2 * (a + b);
                System.out.println("\nKeliling Jajar Genjang              = " +keliling);
                break;
            case 2:
                System.out.print("Inputkan Alas Jajar Genjang         = ");
                alas = sc.nextInt();
                System.out.print("Inputkan Tinggi Jajar Genjang       = ");
                tinggi = sc.nextInt();
                luas = alas * tinggi;
                System.out.println("\nLuas Jajar Genjang                  = " +luas);
                break;
            default:
                System.out.println("Input Salah");
        }
    }
}
