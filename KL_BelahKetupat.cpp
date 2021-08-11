#include <iostream>
using namespace std;

int main()
{
    int menu;
    float s, d1, d2, keliling, luas;

    cout << "========= KELILING & LUAS BELAH KETUPAT =========\n\n";
    cout << "1. Keliling Belah Ketupat\n2. Luas Belah Ketupat\n\n";
    cout << "Inputkan Nomor Menu        = "; cin >> menu;
    cout << endl;

    switch(menu){
        case 1 :
            cout << "Inputkan Sisi Belah Ketupat    = "; cin >> s;
            keliling = 4 * s;
            cout << "\nKeliling Belah Ketupat         = " << keliling << endl;
            break;
        case 2 :
            cout << "Inputkan Diagonal Pertama Belah Ketupat    = "; cin >> d1;
            cout << "Inputkan Diagonal Kedua Belah Ketupat      = "; cin >> d2;
            luas = 0.5 * d1 * d2;
            cout << "\nLuas Belah Ketupat                         = " << luas << endl;
            break;
        default:
            cout << "Input Salah" << endl;
    }
}
