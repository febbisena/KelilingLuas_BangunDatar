#include <iostream>
using namespace std;

int main()
{
    int menu;
    float x, y, d1, d2, keliling, luas;

    cout << "========= KELILING & LUAS LAYANG-LAYANG =========\n\n";
    cout << "1. Keliling Layang-Layang\n2. Luas Layang-Layang\n\n";
    cout << "Inputkan Nomor Menu        = "; cin >> menu;
    cout << endl;

    switch(menu){
        case 1 :
            cout << "Inputkan Sisi Pertama Layang-Layang = "; cin >> x;
            cout << "Inputkan Sisi Kedua Layang-Layang   = "; cin >> y;
            keliling = 2 * (x + y);
            cout << "\nKeliling Layang-Layang              = " << keliling << endl;
            break;
        case 2 :
            cout << "Inputkan Diagonal Pertama Layang-Layang    = "; cin >> d1;
            cout << "Inputkan Diagonal Kedua Layang-Layang      = "; cin >> d2;
            luas = 0.5 * d1 * d2;
            cout << "\nLuas Layang-Layang                         = " << luas << endl;
            break;
        default:
            cout << "Input Salah" << endl;
    }
}
