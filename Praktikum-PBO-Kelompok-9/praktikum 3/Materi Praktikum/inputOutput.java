import java.util.Scanner;
public class inputOutput 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Hello World");  
        System.out.println("Baris kedua");  
        System.out.print("Hello ");  
        System.out.print("World!");  
        System.out.println();  
    
        String nama = "John";
        int umur = 25;
        double tinggi = 175.5;
        System.out.printf("Nama: %s, Umur: %d, Tinggi: %1f cm%n", nama, umur, tinggi);

        // Input String
        System.out.printf("Masukkan nama: ");
        String nama1 = scanner.nextLine();

        // Input Integer
        System.out.printf("Masukkan umur: ");
        int umur1 = scanner.nextInt();

        // Input Double
        System.out.printf("Masukkan tinggi badan: ");
        double tinggi1 = scanner.nextDouble();
       
    }
}