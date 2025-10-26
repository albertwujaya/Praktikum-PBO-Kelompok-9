
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++)
        // {
        //     System.out.println("Perulangan ke-" + i);
        // }

        // String [] mahsiswa = {"Rizky", "Fauzan", "Ardi", "Maulana", "Fikri"};

        // for (int j = 0; j < mahsiswa.length; j++)
        // {
        //     System.out.println("Mahasiswa ke-" + (j + 1) + " : " + mahsiswa[j]);
        // }

        // int a = 1;
        // while (a <= 5)
        // {
        //     System.out.println("Perulangan while ke-" + a);
        //     a++;
        // }

        Scanner input = new Scanner(System.in);
        // String password = "";

        // while (!password.equals("1234"))
        // {
        //     System.out.print("Password : ");
        //     password = input.nextLine();
        // }
        // System.out.println("Password Benar");
        // System.out.println("Selamat Datang"); 
        
        
        // int x = 6;
        // do
        // {
        //     System.out.println("Perulangan do while ke-" + x);
        //     x++;
        // }
        // while (x <= 5);

        System.out.println("---Mencetak nomor kursi bioskop");
        char kursi = 'A';
        for(int k = 0; k <= 3; k++)
        {
            for(int l = 1; l <= 5; l++)
            {
                System.out.print(kursi + "" + l + " ");
            }
            kursi++;
            System.out.println();
        }
    }
    
}
