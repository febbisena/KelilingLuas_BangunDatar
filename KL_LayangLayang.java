
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
public class KL_LayangLayang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        double x, y, d1, d2, keliling, luas;
        
        System.out.println("========= KELILING & LUAS LAYANG-LAYANG =========\n\n");
        System.out.println("1. Keliling Layang-Layang\n2. Luas Layang-Layang\n\n");
        System.out.print("Inputkan Nomor Menu        = ");
        menu = sc.nextInt();
        System.out.println("");
        
        switch(menu){
            case 1:
                System.out.print("Inputkan Sisi Pertama Layang-Layang = ");
                x = sc.nextDouble();
                System.out.print("Inputkan Sisi Kedua Layang-Layang   = ");
                y = sc.nextDouble();
                keliling = 2 * (x + y);
                System.out.println("\nKeliling Layang-Layang              = " +keliling);
                break;
            case 2:
                System.out.print("Inputkan Diagonal Pertama Layang-Layang    = ");
                d1 = sc.nextDouble();
                System.out.print("Inputkan Diagonal Kedua Layang-Layang      = ");
                d2 = sc.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("\nLuas Layang-Layang                         = " +luas);
                break;
            default:
                System.out.println("Input Salah");
        }
    }
}
