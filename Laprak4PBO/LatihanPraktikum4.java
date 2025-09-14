import java.util.Scanner; // Mengimpor Scanner

public class LatihanPraktikum4 // Kelas Utama
{
    public static void main(String[] args) 
    {
        // Scanner input, variabel menu, dan konstanta PHI
        Scanner input = new Scanner(System.in);
        int pilihan;
        final double PHI = 3.14;

        System.out.println("\nSELAMAT DATANG DIPROGRAM KALKULATOR LUAS BANGUN DATAR");
        do {
            // Menampilkan menu pilihan
            System.out.println("\nSILAKAN PILIH BANGUN DATAR BERIKUT: ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();

            // Switch Case untuk pilihan bangun datar
            switch (pilihan) {
                case 1: // Persegi
                    System.out.print("Masukkan sisi persegi dalam cm: ");
                    double sisi = input.nextDouble(); // Meminta user input sisi persegi
                    double luasPersegi = sisi * sisi; // Rumus persegi
                    System.out.println("Luas Persegi : " + luasPersegi + " cm^2"); 
                    break;

                case 2: // Persegi Panjang
                    System.out.print("Masukkan panjang dalam cm: ");
                    double panjang = input.nextDouble(); // Meminta user input panjang
                    System.out.print("Masukkan lebar dalam cm: ");
                    double lebar = input.nextDouble(); // Meminta user input lebar
                    double luasPersegiPanjang = panjang * lebar; // Rumus persegi panjang
                    System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang  + " cm^2");
                    break;

                case 3: // Lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jari = input.nextDouble(); // Meminta user input jari-jari
                    double luasLingkaran = PHI * jari * jari; // Rumus lingkaran
                    System.out.println("Luas Lingkaran : " + luasLingkaran + " cm^2");
                    break;

                case 4: // Segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = input.nextDouble(); // Meminta user input alas
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = input.nextDouble(); // Meminta user input tinggi
                    double luasSegitiga = 0.5 * alas * tinggi; // Rumus segitiga
                    System.out.println("Luas Segitiga : " + luasSegitiga + " cm^2");
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai."); // Keluar dari program
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi!"); // Pilihan bukan 1-5
            }
        }while (pilihan != 5);
    }
}
