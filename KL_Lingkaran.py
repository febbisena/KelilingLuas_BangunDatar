print("======= Keliling dan Luas Lingkaran =======")
print("\n1. Keliling Lingkaran\n2. Luas Lingkaran")
menu = int(input("\nInputkan Nomor Menu = "))

phi = 3.14
if(menu == 1):
    d = int(input("\nInputkan diameter = "))
    keliling = phi * d
    print("\nKeliling lingkaran adalah ", keliling)
elif(menu == 2):
    r = int(input("\nInputkan jari-jari = "))
    luas = phi * r * r
    print("\nLuas lingkaran adalah ", luas)
else:
    print("Nomor Menu Tidak Tersedia")