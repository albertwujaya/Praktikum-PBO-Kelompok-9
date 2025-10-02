package utspraktikum;
import java.util.Scanner;

public class Mahasiswa {

    Scanner scanner = new Scanner(System.in);

    String nama;
    String nim;
    String prodi;
    String tahunMasuk;

    public Mahasiswa(){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Mahasiswa biodata = new Mahasiswa();
        Mahasiswa biodata1 = new Mahasiswa();

        System.out.println("Selamat datang di aplikasi StudentApp!");

        System.out.println("Silahkan masukkan NIM anda: ");

        System.out.println("Apa program studi anda?");

    }

    public void biodata(){
        String mahasiswa;
    }

    String biodata(String nama, String nim, String prodi, String tahunMasuk){
        System.out.println("Silahkan masukkan nama anda: ");
        nama = scanner.nextLine();
        return nama;
    }
}

