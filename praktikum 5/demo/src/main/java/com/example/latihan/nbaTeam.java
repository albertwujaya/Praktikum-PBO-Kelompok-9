package com.example.latihan;

public class nbaTeam {
    // Atribut/field dari class TimNBA
    private String namaTim;
    private String kota;
    private int tahunBerdiri;
    private int jumlahJuara;
    private String pelatih;
    private String arena;
    
    // Constructor Overloading
    
    // Constructor 1: Constructor default
    public nbaTeam() {
        this.namaTim = "Tim Belum Ditentukan";
        this.kota = "Kota Belum Ditentukan";
        this.tahunBerdiri = 0;
        this.jumlahJuara = 0;
        this.pelatih = "Pelatih Belum Ditentukan";
        this.arena = "Arena Belum Ditentukan";
    }
    
    // Constructor 2: Constructor dengan nama tim dan kota
    public nbaTeam(String namaTim, String kota) {
        this.namaTim = namaTim;
        this.kota = kota;
        this.tahunBerdiri = 0;
        this.jumlahJuara = 0;
        this.pelatih = "Pelatih Belum Ditentukan";
        this.arena = "Arena Belum Ditentukan";
    }
    
    // Constructor 3: Constructor dengan nama tim, kota, dan tahun berdiri
    public nbaTeam(String namaTim, String kota, int tahunBerdiri) {
        this.namaTim = namaTim;
        this.kota = kota;
        this.tahunBerdiri = tahunBerdiri;
        this.jumlahJuara = 0;
        this.pelatih = "Pelatih Belum Ditentukan";
        this.arena = "Arena Belum Ditentukan";
    }
    
    // Constructor 4: Constructor lengkap dengan semua parameter
    public nbaTeam(String namaTim, String kota, int tahunBerdiri, int jumlahJuara, String pelatih, String arena) {
        this.namaTim = namaTim;
        this.kota = kota;
        this.tahunBerdiri = tahunBerdiri;
        this.jumlahJuara = jumlahJuara;
        this.pelatih = pelatih;
        this.arena = arena;
    }
    
    // Method untuk update data tim
    public void updateTim(String namaTim, String kota, int tahunBerdiri, int jumlahJuara, String pelatih, String arena) {
        this.namaTim = namaTim;
        this.kota = kota;
        this.tahunBerdiri = tahunBerdiri;
        this.jumlahJuara = jumlahJuara;
        this.pelatih = pelatih;
        this.arena = arena;
    }
    
    // Method overloading untuk update data parsial
    public void updateTim(String namaTim, String kota) {
        this.namaTim = namaTim;
        this.kota = kota;
    }
    
    public void updatePelatih(String pelatih) {
        this.pelatih = pelatih;
    }
    
    public void updateArena(String arena) {
        this.arena = arena;
    }
    
    public void updateTahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }
    
    // Method Overloading
    
    // Method 1: tampilkanInfo tanpa parameter
    public void tampilkanInfo() {
        System.out.println("=== Informasi Tim NBA ===");
        System.out.println("Nama Tim: " + namaTim);
        System.out.println("Kota: " + kota);
        System.out.println("Tahun Berdiri: " + tahunBerdiri);
        System.out.println("Jumlah Juara: " + jumlahJuara);
        System.out.println("Pelatih: " + pelatih);
        System.out.println("Arena: " + arena);
        System.out.println();
    }
    
    // Method 2: tampilkanInfo dengan parameter boolean untuk format singkat
    public void tampilkanInfo(boolean formatSingkat) {
        if (formatSingkat) {
            System.out.println(namaTim + " (" + kota + ") - " + jumlahJuara + " Juara");
        } else {
            tampilkanInfo(); // Memanggil method tampilkanInfo() yang pertama
        }
    }
    
    // Method 3: tampilkanInfo dengan parameter String untuk kategori info
    public void tampilkanInfo(String kategori) {
        System.out.println("=== " + kategori + " ===");
        switch (kategori.toLowerCase()) {
            case "basic":
                System.out.println("Tim: " + namaTim + " dari " + kota);
                break;
            case "sejarah":
                System.out.println("Tim: " + namaTim);
                System.out.println("Berdiri: " + tahunBerdiri);
                System.out.println("Total Juara: " + jumlahJuara);
                break;
            case "manajemen":
                System.out.println("Tim: " + namaTim);
                System.out.println("Pelatih: " + pelatih);
                System.out.println("Arena: " + arena);
                break;
            default:
                System.out.println("Kategori tidak dikenal. Gunakan: basic, sejarah, atau manajemen");
        }
        System.out.println();
    }
    
    // Method overloading untuk menambah juara
    
    // Method 1: tambahJuara tanpa parameter (tambah 1)
    public void tambahJuara() {
        this.jumlahJuara++;
        System.out.println(namaTim + " berhasil menambah 1 juara! Total juara sekarang: " + jumlahJuara);
    }
    
    // Method 2: tambahJuara dengan parameter int
    public void tambahJuara(int jumlah) {
        this.jumlahJuara += jumlah;
        System.out.println(namaTim + " berhasil menambah " + jumlah + " juara! Total juara sekarang: " + jumlahJuara);
    }
    
    // Method 3: tambahJuara dengan parameter int dan String (tahun)
    public void tambahJuara(int jumlah, String tahun) {
        this.jumlahJuara += jumlah;
        System.out.println(namaTim + " berhasil menambah " + jumlah + " juara di tahun " + tahun + "! Total juara sekarang: " + jumlahJuara);
    }
    
    // Main method untuk testing dan membuat 3 object
    public static void main(String[] args) {
        System.out.println("=== DEMO CLASS TIM NBA ===\n");
        
        // Object 1: Menggunakan constructor dengan 2 parameter, lalu update data
        nbaTeam tim1 = new nbaTeam("Los Angeles Lakers", "Los Angeles");
        tim1.updateTahunBerdiri(1947);
        tim1.tambahJuara(17); // Menggunakan method tambahJuara untuk set jumlah juara
        tim1.updatePelatih("Darvin Ham");
        tim1.updateArena("Crypto.com Arena");
        
        // Object 2: Menggunakan constructor lengkap
        nbaTeam tim2 = new nbaTeam("Golden State Warriors", "San Francisco", 1946, 7, "Steve Kerr", "Chase Center");
        
        // Object 3: Menggunakan constructor default, lalu update semua data sekaligus
        nbaTeam tim3 = new nbaTeam();
        tim3.updateTim("Boston Celtics", "Boston", 1946, 18, "Joe Mazzulla", "TD Garden");
        
        // Demo method overloading untuk tampilkanInfo
        System.out.println("=== DEMO METHOD OVERLOADING - tampilkanInfo ===");
        
        // Method tampilkanInfo() tanpa parameter
        tim1.tampilkanInfo();
        
        // Method tampilkanInfo(boolean) dengan format singkat
        System.out.println("Format Singkat:");
        tim1.tampilkanInfo(true);
        tim2.tampilkanInfo(true);
        tim3.tampilkanInfo(true);
        System.out.println();
        
        // Method tampilkanInfo(String) dengan kategori
        tim2.tampilkanInfo("basic");
        tim2.tampilkanInfo("sejarah");
        tim2.tampilkanInfo("manajemen");
        
        // Demo method overloading untuk tambahJuara
        System.out.println("=== DEMO METHOD OVERLOADING - tambahJuara ===");
        
        // Method tambahJuara() tanpa parameter
        tim1.tambahJuara();
        
        // Method tambahJuara(int)
        tim2.tambahJuara(2);
        
        // Method tambahJuara(int, String)
        tim3.tambahJuara(1, "2024");
        
        System.out.println("\n=== INFORMASI FINAL SEMUA TIM ===");
        tim1.tampilkanInfo(true);
        tim2.tampilkanInfo(true);
        tim3.tampilkanInfo(true);
    }
}