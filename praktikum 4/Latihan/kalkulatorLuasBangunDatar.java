import java.util.Scanner;

public class kalkulatorLuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        final double phi = 3.14;

        System.out.println("Kalkulator Luas Bangun Datar");
        do 
        {
        // Memunculkan Menu pilihan
            System.out.println("Pilih bangun datar : ");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Persegi");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilihan (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) 
            {
                case 1: // Persegi
                    System.out.print("Sisi : ");
                    double sisi = input.nextDouble();
                    System.out.println("Luas Persegi : " + sisi * sisi);
                    break;

                case 2: // persegi panjang
                    System.out.print("Panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Lebar : ");
                    double lebar = input.nextDouble();
                    System.out.println("Luas Persegi Panjang : " + panjang * lebar);
                    break;

                case 3: // Segitiga
                    System.out.print("Alas : ");
                    double alas = input.nextDouble();
                    System.out.print("Tinggi : ");
                    double tinggi = input.nextDouble();
                    System.out.println("Luas Segitiga : " + (alas * tinggi) / 2);
                    break;
                case 4: // lingkaran
                    System.out.print("jari-jari : ");
                    double jari = input.nextDouble();
                    System.out.println("Luas Lingkaran : " + phi * jari * jari);
                    break;
                case 5: // Keluar
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1-5.");
            }
        }while (pilihan != 5);
    }
    
}
