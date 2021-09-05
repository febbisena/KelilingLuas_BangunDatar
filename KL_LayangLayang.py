print("======= Keliling dan Luas Layang-Layang =======")
print("\n1. Keliling Layang-Layang\n2. Luas Layang-Layang")
menu = int(input("\nInputkan Nomor Menu = "))

if(menu == 1):
    a = int(input("\nInputkan sisi pertama    = "))
    b = int(input("Inputkan sisi kedua      = "))
    keliling = 2 * (a + b)
    print("\nKeliling layang-layang adalah ", keliling)
elif(menu == 2):
    d1 = int(input("\nInputkan diagonal pertama   = "))
    d2 = int(input("Inputkan diagonal kedua     = "))
    luas = 0.5 * (d1 * d2)
    print("\nLuas layang-layang adalah ", luas)
else:
    print("Nomor Menu Tidak Tersedia")