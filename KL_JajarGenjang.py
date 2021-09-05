print("======= Keliling dan Luas Jajar Genjang =======")
print("\n1. Keliling Jajar Genjang\n2. Luas Jajar Genjang")
menu = int(input("\nInputkan Nomor Menu = "))

if(menu == 1):
    a = int(input("\nInputkan sisi pertama    = "))
    b = int(input("Inputkan sisi kedua      = "))
    keliling = 2 * (a + b)
    print("\nKeliling jajar genjang adalah ", keliling)
elif(menu == 2):
    a = int(input("\nInputkan alas   = "))
    t = int(input("Inputkan tinggi   = "))
    luas = a * t
    print("\nLuas jajar genjang adalah ", luas)
else:
    print("Nomor Menu Tidak Tersedia")