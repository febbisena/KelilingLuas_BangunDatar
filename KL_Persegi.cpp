#include <iostream>
using namespace std;

int main()
{
    int sisi, keliling, luas;

    cout << "=============== KELILING & LUAS PERSEGI ===============\n\n";
    cout << "Masukkan sisi persegi  = "; cin >> sisi;
    cout << endl;

    keliling = 4 * sisi;
    luas = sisi * sisi;

    cout << "Keliling Persegi       = " << keliling << endl;
    cout << "Luas Persegi           = " << luas << endl;
}
