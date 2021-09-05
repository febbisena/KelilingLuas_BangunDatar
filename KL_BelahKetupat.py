print("======= Keliling dan Luas Belah Ketupat =======")
print("\n1. Keliling Belah Ketupat\n2. Luas Belah Ketupat")
menu = int(input("\nInputkan Nomor Menu = "))

if(menu == 1):
    s = int(input("\nInputkan sisi = "))
    keliling = 4 * s
    print("\nKeliling belah ketupat adalah ", keliling)
elif(menu == 2):
    d1 = int(input("\nInputkan diagonal pertama   = "))
    d2 = int(input("Inputkan diagonal kedua     = "))
    luas = 0.5 * (d1 * d2)
    print("\nLuas belah ketupat adalah ", luas)
else:
    print("Nomor Menu Tidak Tersedia")