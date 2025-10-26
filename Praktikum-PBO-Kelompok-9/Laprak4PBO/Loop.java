import java.util.Scanner;
public class Loop 
{
    public static void main(String[] args) 
    {
        int i;
        for (i = 1; i <= 5; i++)
        {
            System.out.println("Perulangan ke- " + i);
        }

        String [] mahasiswa = {"Andi", "Budi", "Citra", "Dewi", "Eko"};

        for (int j=0; j < mahasiswa.length; j++)
        {
            System.out.println("Mahasiswa ke- " + (j+1) + ": " + mahasiswa[j]);
        }

        int a = 1;
        while (a <= 5)
        {
            System.out.println("While Loop ke-" + a);
            a++;
        }

        Scanner input = new Scanner(System.in);
        String password = "";

        while ( !password.equals("java123"))
        {
            System.out.println("Masukkan password: ");
            password = input.nextLine();
        }
        System.out.println("Login berhasil");

        int x = 6;
        do 
        {
            System.out.println("Do While Loop ke-" + x);
            x++;
        }
        while (x <= 5);


        System.out.println();

        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int k = 0; k < 3; k++)
        {
            for ( int l = 1; l <=5; l++)
            {
                System.out.print(kursi + "" + l + " ");
            }
            System.out.println();
            kursi++;
        }
    }
}
