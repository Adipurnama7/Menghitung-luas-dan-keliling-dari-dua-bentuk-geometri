Program sederhana yang menghitung luas dan keliling dari dua bentuk geometri yaitu persegi 
panjang dan segitiga.

**1.Interface BentukGeometri****

Mendefinisikan method abstrak hitungLuas() dan hitungKeliling() untuk bangun 
datar.

**2.Kelas Abstrak Bangunan****

o Mewarisi interface BentukGeometri.

o Memiliki atribut panjang dan lebar.

o Menyediakan method getter/setter untuk panjang dan lebar.

o Memiliki method abstrak hitungLuas().

o Mengimplementasikan method hitungKeliling().

**3.Kelas PersegiPanjang dan Segitiga**

o Mewarisi kelas Bangunan.

o Memiliki konstruktor dan method hitungLuas() spesifik.

**6. Kelas Main**

o Membuat objek PersegiPanjang dan Segitiga.

o Menampilkan informasi luas dan keliling
