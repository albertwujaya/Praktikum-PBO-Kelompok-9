package com.example;

public class Produk implements hargaAkhir {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: " + harga);
    }

    public double hitungPajak() {
        return harga * 0.05; // 5% pajak
    }

    public double hitungHarga(){
        return harga * 1.05;
    }

}
