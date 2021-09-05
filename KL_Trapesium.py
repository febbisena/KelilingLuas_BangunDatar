print("======= Keliling dan Luas Trapesium =======")
print("\n1. Keliling Trapesium\n2. Luas Trapesium")
menu = int(input("\nInputkan Nomor Menu = "))

if(menu == 1):
    a = int(input("\nInputkan sisi pertama    = "))
    b = int(input("Inputkan sisi kedua      = "))
    c = int(input("Inputkan sisi ketiga     = "))
    d = int(input("Inputkan sisi keempat    = "))
    keliling = a + b + c + d
    print("\nKeliling trapesium adalah ", keliling)
elif(menu == 2):
    a = int(input("\nInputkan sisi atas   = "))
    b = int(input("Inputkan sisi bawah  = "))
    t = int(input("Inputkan tinggi      = "))
    luas = 0.5 * ((a + b) * t)
    print("\nLuas trapesium adalah ", luas)
else:
    print("Nomor Menu Tidak Tersedia")