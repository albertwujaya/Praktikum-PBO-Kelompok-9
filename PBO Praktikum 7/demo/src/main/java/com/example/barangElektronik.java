package com.example;

public class barangElektronik extends Produk implements hargaAkhir {
    private int garansi; 

    public barangElektronik(String nama, int harga, int garansi) {
        super(nama, harga);
        this.garansi = garansi;
    }

    public void tampilkanGaransi() {
        System.out.println("Garansi: " + garansi + " bulan");
    }

    @Override // Method overriding
    public double hitungPajak() {
        return harga * 0.01; // 1% pajak untuk barang elektronik
    }

    @Override
    public double hitungHarga(){
        return harga * 1.01;
    }

}
