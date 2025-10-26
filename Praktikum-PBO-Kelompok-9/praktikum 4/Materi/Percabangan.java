import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        // int nilai = input.nextInt();
        
        // if (nilai > 75)
        // {
        //     System.out.println("Selamat Anda Lulus");
        // }
        // else
        // {
        //     System.out.println("Maaf Anda Tidak Lulus");
        // }

        // if (nilai > 75)
        // {
        //     System.out.println("Selamat Anda Lulus");
        // }
        // else if (nilai > 65)
        // {
        //     System.out.println("Nilai anda berada di ambang kelulusan");
        // }
        // else
        // {
        //     System.out.println("Maaf Anda Tidak Lulus");
        // }

        // System.out.print("Masukkan warna (RGB)");
        // String warna = input.nextLine();

        // switch (warna)
        // {
        //     case "Merah":
        //         System.out.println("Warna yang dipilih adalah Warna Merah");
        //         break;
        //     case "Hijau":
        //         System.out.println("Warna yang dipilih adalah Warna Hijau");
        //         break;
        //     case "Biru":
        //         System.out.println("Warna yang dipilih adalah Warna Biru");
        //         break;
        //     default:
        //         System.out.println("Warna Tidak Diketahui");
        //         break;
        // }

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka >0)
        {
            System.out.println("Angka Positif");

            if (angka % 2 == 0)
            {
                System.out.println("Angka Genap");
            }
            else
            {
                System.out.println("Angka Ganjil");
            }
        }
        else if (angka == 0)
        {
            System.out.println("Angka Nol");
        }
        else
        {
            System.out.println("Angka Negatif");

            if (angka % 2 == 0)
            {
                System.out.println("Angka Genap");
            }
            else
            {
                System.out.println("Angka Ganjil");
            }
        }
    }
}
