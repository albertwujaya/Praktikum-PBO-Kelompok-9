package com.example;

public class Main {
    public static void main(String[] args) {
        // barangElektronik laptop = new barangElektronik
        // ("Laptop", 15000000, 24);
        // laptop.tampilkanInfo();
        // laptop.tampilkanGaransi();

        // Produk smartphone = new Produk("Smartphone", 8000000);
        // smartphone.tampilkanInfo();
        // smartphone.tampilkanGaransi();

        Produk p1 = new Produk("buku", 6000);
        barangElektronik p2 = new barangElektronik("Mouse", 500000, 12);

        p1.tampilkanInfo();
        System.out.println("Pajak Produk Umum : " + p1.hitungPajak());
        System.out.println("Harga Akhir : " + p1.hitungHarga());
        System.out.println("-----------------");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak Barang Elektronik : " + p2.hitungPajak());
        System.out.println("Harga Akhir : " + p2.hitungHarga());
    }
}