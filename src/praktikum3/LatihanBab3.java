package praktikum3;

import java.util.Scanner;

public class LatihanBab3 {
	
    public static void main (String[]args) {
        
    	// Deklarasi scanner dan variabel
        Scanner input = new Scanner (System.in);
        double jari, tinggi, volume;
        final double pi = 3.14;

        System.out.println("It's Geometry Time Baby!! (Pipe Edition)");

        // Input jari-jari tabung
        System.out.println("Masukkan nilai jari-jari tabung dalam cm: ");
        jari = input.nextDouble();
       
        // Input tinggi tabung
        System.out.println("Masukkan nilai tinggi tabung dalam cm: ");
        tinggi = input.nextDouble();

        // Rumus tabung
        volume = pi * (jari*jari) * tinggi;

        // Output volume tabung
        System.out.println("Maka volume dari tabung tersebut adalah: " + volume + "cm^3");
    
    }
}