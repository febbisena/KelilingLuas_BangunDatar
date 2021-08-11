#include <iostream>
using namespace std;

int main()
{
    int menu;
    float a, b, c, d, s_atas, s_bawah, tinggi, keliling, luas;

    cout << "=============== KELILING & LUAS TRAPESIUM ===============\n\n";
    cout << "1. Keliling Trapesium\n2. Luas Trapesium\n\n";
    cout << "Inputkan Nomor Menu            = "; cin >> menu;
    cout << endl;

    switch(menu){
        case 1 :
            cout << "Inputkan Sisi Pertama Trapesium = "; cin >> a;
            cout << "Inputkan Sisi Kedua Trapesium   = "; cin >> b;
            cout << "Inputkan Sisi Ketiga Trapesium  = "; cin >> c;
            cout << "Inputkan Sisi Keempat Trapesium = "; cin >> d;
            keliling = a + b + c + d;
            cout << "\nKeliling Trapesium              = " << keliling << endl;
            break;
        case 2 :
            cout << "Inputkan Sisi Atas Trapesium    = "; cin >> s_atas;
            cout << "Inputkan Sisi Bawah Trapesium   = "; cin >> s_bawah;
            cout << "Inputkan Tinggi Trapesium       = "; cin >> tinggi;
            luas = 0.5 * ((s_atas + s_bawah) * tinggi);
            cout << "\nLuas Trapesium                  = " << luas << endl;
            break;
        default:
            cout << "Input Salah" << endl;
    }
}
