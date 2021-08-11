#include <iostream>
using namespace std;

int main()
{
    int menu;
    float a, b, c, alas, tinggi, keliling, luas;

    cout << "=============== KELILING & LUAS SEGITIGA ===============\n\n";
    cout << "1. Keliling Segitiga\n2. Luas Segitiga\n\n";
    cout << "Inputkan Nomor Menu            = "; cin >> menu;
    cout << endl;

    switch(menu){
        case 1 :
            cout << "Inputkan Sisi Pertama Segitiga = "; cin >> a;
            cout << "Inputkan Sisi Kedua Segitiga   = "; cin >> b;
            cout << "Inputkan Sisi Ketiga Segitiga  = "; cin >> c;
            keliling = a + b + c;
            cout << "\nKeliling Segitiga              = " << keliling << endl;
            break;
        case 2 :
            cout << "Inputkan Alas Segitiga         = "; cin >> alas;
            cout << "Inputkan Tinggi Segitiga       = "; cin >> tinggi;
            luas = 0.5 * (alas * tinggi);
            cout << "\nLuas Segitiga                  = " << luas << endl;
            break;
        default:
            cout << "Input Salah" << endl;
    }
}
