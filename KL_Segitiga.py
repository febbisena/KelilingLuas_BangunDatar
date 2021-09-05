print("======= Keliling dan Luas Segitiga =======")
print("\n1. Keliling Segitiga\n2. Luas Segitiga")
menu = int(input("\nInputkan Nomor Menu = "))

if(menu == 1):
    a = int(input("\nInputkan sisi pertama    = "))
    b = int(input("Inputkan sisi kedua      = "))
    c = int(input("Inputkan sisi ketiga     = "))
    keliling = a + b + c
    print("\nKeliling segitiga adalah ", keliling)
elif(menu == 2):
    a = int(input("\nInputkan alas    = "))
    t = int(input("Inputkan tinggi  = "))
    luas = 0.5 * a * t
    print("\nLuas segitiga adalah ", luas)
else:
    print("Nomor Menu Tidak Tersedia")