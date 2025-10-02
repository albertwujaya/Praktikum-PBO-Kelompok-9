package utspraktikum;
import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        final double phi = 3.14;

        System.out.println("Kalkulator Bangun Ruang");
        do {
            // Print out menu pilihan
            System.out.println("Pilih bangun ruang : ");
            System.out.println("1. Kubus");
            System.out.println("2. Bola");
            System.out.println("3. Limas Segilima");
            System.out.println("4. Keluar");
            System.out.print("Pilihan (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: // Kubus
                    System.out.print("Panjang rusuk : ");
                    double sisi = input.nextDouble();
                    System.out.println("Volume Kubus : " + sisi * sisi * sisi);
                    System.out.println("Luas Permukaan Kubus : " + sisi * sisi);
                    break;

                case 2: // Bola
                    System.out.print("Jari-jari : ");
                    double jari = input.nextDouble();
                    System.out.println("Volume Bola : " + 4/3 * phi * jari * jari * jari);
                    System.out.println("Luas Permukaan Bola : " + 4 * phi * jari * jari);
                    break;

                case 3: // Limas Segilima
                    System.out.print("Sisi : ");
                    double sisiLimas = input.nextDouble();
                    double alas = sisiLimas * sisiLimas;
                    System.out.print("Tinggi : ");
                    double tinggi = input.nextDouble();
                    double segitiga = (alas * tinggi) / 2;
                    System.out.println("Luas Segitiga : " + (alas * tinggi) / 2);
                    System.out.println("Volume Limas: " + 1/3 * alas * tinggi);
                    System.out.println("Luas Permukaan Limas: " + (alas + segitiga));
                    break;
                case 4: // Keluar
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1-4.");
            }
        }while (pilihan != 4);
    }

}