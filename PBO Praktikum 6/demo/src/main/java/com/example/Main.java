package com.example;
public class Main {
    public static void main (String[] args) throws Exception{
        Produk p1 = new Produk ("Laptop",12000000,5);
        Produk p2 = new Produk ("HP", 3500000,10);
        
//        System.out.println(p1.nama);
//        System.out.println(p1.stock);
//        System.out.println(p1.harga);

//        p1.tampilkanInfo();
//        p2.tampilkanInfo();
//        
////        p1.namaSupplier();
//        p1.namaSupplierFix();

    p1.tampilkanInfo();
    p1.namaSupplierFix();
    p1.setHarga(10800000);
    System.out.println("Harga produk adalah :" + p1.getHarga());
    }
}
