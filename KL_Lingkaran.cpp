#include <iostream>
using namespace std;

int main()
{
    int menu;
    float r, d, keliling, luas;
    const float phi = 3.14;

    cout << "=============== KELILING & LUAS LINGKARAN ===============\n\n";
    cout << "1. Keliling Lingkaran\n2. Luas Lingkaran\n\n";
    cout << "Inputkan Nomor Menu        = "; cin >> menu;
    cout << endl;

    switch(menu){
        case 1 :
            cout << "Inputkan Diameter Lingkaran        = "; cin >> d;
            keliling = phi * d;
            cout << "\nKeliling Lingkaran                 = " << keliling << endl;
            break;
        case 2 :
            cout << "Inputkan Jari-Jari Lingkaran       = "; cin >> r;
            luas = phi * r * r;
            cout << "\nLuas Lingkaran                     = " << luas << endl;
            break;
        default:
            cout << "Input Salah" << endl;
    }
}
