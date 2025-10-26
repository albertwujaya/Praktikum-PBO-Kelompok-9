import java.util.Scanner;

public class Kalkulator 
{
    public static void main (String[]args)
    {
        // Membuat objek baru Scanner dengan nama input
        Scanner input = new Scanner (System.in);
        final double PHI = 3.14; 

        System.out.println("Selamat datang ke penghitung volume ruang tabung");

        // Menampilkan dan meminta pengguna memasukkan jari-jari
        System.out.println("Tolong masukkan jari-jarinya dalam cm");
        double jariJari = input.nextDouble();
       
        // Menampilkan dan meminta pengguna memasukkan jari-jari
        System.out.println("Tolong masukkan tinggi dalam cm");
        double tinggi = input.nextDouble();

        double volume = PHI * jariJari * jariJari * tinggi; // Rumus tabunng π x r^ x t

        System.out.println("Maka volume dari tabung tersebut adalah: " + volume + "cm^3"); // Menampilkan hasil volume tabung
    }
}