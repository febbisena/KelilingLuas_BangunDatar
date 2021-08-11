#include <iostream>
using namespace std;

int main()
{
    int panjang, lebar, keliling, luas;

    cout << "========== KELILING & LUAS PERSEGI PANJANG ==========\n\n";
    cout << "Masukkan panjang persegi panjang   = "; cin >> panjang;
    cout << "Masukkan lebar persegi panjang     = "; cin >> lebar;
    cout << endl;

    keliling = 2 * (panjang + lebar);
    luas = panjang * lebar;

    cout << "Keliling Persegi Panjang           = " << keliling << endl;
    cout << "Luas Persegi Panjang               = " << luas << endl;
}
