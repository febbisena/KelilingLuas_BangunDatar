#include <iostream>
using namespace std;

int main()
{
    int menu, a, b, alas, tinggi, keliling, luas;

    cout << "========= KELILING & LUAS JAJAR GENJANG =========\n\n";
    cout << "1. Keliling Jajar Genjang\n2. Luas Jajar Genjang\n\n";
    cout << "Inputkan Nomor Menu            = "; cin >> menu;
    cout << endl;

    switch(menu){
        case 1 :
            cout << "Inputkan Sisi Pertama Jajar Genjang = "; cin >> a;
            cout << "Inputkan Sisi Kedua Jajar Genjang   = "; cin >> b;
            keliling = 2 * (a + b);
            cout << "\nKeliling Jajar Genjang              = " << keliling << endl;
            break;
        case 2 :
            cout << "Inputkan Alas Jajar Genjang         = "; cin >> alas;
            cout << "Inputkan Tinggi Jajar Genjang       = "; cin >> tinggi;
            luas = alas * tinggi;
            cout << "\nLuas Jajar Genjang                  = " << luas << endl;
            break;
        default:
            cout << "Input Salah" << endl;
    }
}
