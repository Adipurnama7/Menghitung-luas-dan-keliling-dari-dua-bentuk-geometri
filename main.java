// Definisi interface BentukGeometri
interface BentukGeometri {
  double hitungLuas();
  double hitungKeliling();
}

// Definisi kelas abstrak Bangunan
abstract class Bangunan implements BentukGeometri {
  private double panjang;
  private double lebar;

  public Bangunan(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  // Getter dan setter untuk panjang dan lebar
  public double getPanjang() {
    return panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  // Abstraksi method hitungLuas() yang harus diimplementasikan oleh subkelas
  public abstract double hitungLuas();

  // Implementasi method hitungKeliling() dengan visibility sama seperti di interface
  @Override
  public double hitungKeliling() {
    return 2 * (panjang + lebar);
  }
}

// Definisi kelas Persegi Panjang yang mewarisi Bangunan
class PersegiPanjang extends Bangunan {
  public PersegiPanjang(double panjang, double lebar) {
    super(panjang, lebar);
  }

  // Implementasi method hitungLuas() untuk Persegi Panjang
  @Override
  public double hitungLuas() {
    return getPanjang() * getLebar();
  }
}

// Definisi kelas Segitiga yang mewarisi Bangunan
class Segitiga extends Bangunan {
  private double alas;
  private double tinggi;

  public Segitiga(double panjang, double lebar, double alas, double tinggi) {
    super(panjang, lebar);
    this.alas = alas;
    this.tinggi = tinggi;
  }

  // Getter dan setter untuk alas dan tinggi
  public double getAlas() {
    return alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  // Implementasi method hitungLuas() untuk Segitiga
  @Override
  public double hitungLuas() {
    return (alas * tinggi) / 2;
  }
}

// Kelas utama untuk menjalankan program
public class main {
  public static void main(String[] args) {
    
    PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);

   
    System.out.println("Persegi Panjang:");
    System.out.println("Panjang: " + persegiPanjang.getPanjang());
    System.out.println("Lebar: " + persegiPanjang.getLebar());
    System.out.println("Luas: " + persegiPanjang.hitungLuas());
    System.out.println("Keliling: " + persegiPanjang.hitungKeliling());

   
    Segitiga segitiga = new Segitiga(4, 6, 5, 8);

   
    System.out.println("\nSegitiga:");
    System.out.println("Alas: " + segitiga.getAlas());
    System.out.println("Tinggi: " + segitiga.getTinggi());
    System.out.println("Luas: " + segitiga.hitungLuas());
    System.out.println("Keliling: " + segitiga.hitungKeliling());
  }
}
