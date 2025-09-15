package kelasPBO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class WarungKopi {

    public static void main(String[] args) {
        // --- BAGIAN 1: INISIALISASI ---
        // Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // ArrayList untuk menyimpan daftar pesanan sesuai urutan
        ArrayList<String> daftarPesanan = new ArrayList<>();

        // HashSet untuk memastikan tidak ada nama menu yang duplikat (untuk pengecekan cepat)
        HashSet<String> menuUnik = new HashSet<>();

        boolean isRunning = true;

        // --- BAGIAN 2: MENU UTAMA (LOOP) ---
        // Loop akan terus berjalan selama isRunning bernilai true
        while (isRunning) {
            System.out.println("\n===== Aplikasi Manajemen Pesanan Warung Kopi =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Hapus Pesanan");
            System.out.println("3. Tampilkan Semua Pesanan");
            System.out.println("4. Keluar");
            System.out.print("--> Pilih menu (1-4): ");

            // Membaca pilihan pengguna
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Penting! untuk membersihkan buffer setelah membaca angka

            switch (pilihan) {
                // --- BAGIAN 3: LOGIKA TAMBAH PESANAN ---
                case 1:
                    System.out.print("Masukkan nama menu pesanan: ");
                    String menuBaru = scanner.nextLine();

                    // Cek duplikat menggunakan HashSet.
                    // Metode .add() pada HashSet akan return 'true' jika item berhasil ditambahkan (item baru),
                    // dan 'false' jika item sudah ada (duplikat).
                    if (menuUnik.add(menuBaru)) {
                        // Jika item baru, tambahkan juga ke ArrayList
                        daftarPesanan.add(menuBaru);
                        System.out.println("✅ Pesanan '" + menuBaru + "' berhasil ditambahkan!");
                    } else {
                        System.out.println("❌ Gagal! Menu '" + menuBaru + "' sudah ada dalam daftar pesanan.");
                    }
                    break;

                // --- BAGIAN 4: LOGIKA HAPUS PESANAN ---
                case 2:
                    System.out.print("Masukkan nama menu yang akan dihapus: ");
                    String menuHapus = scanner.nextLine();

                    // Cek apakah menu ada di HashSet sebelum menghapus
                    if (menuUnik.contains(menuHapus)) {
                        // Hapus dari kedua koleksi agar tetap sinkron
                        menuUnik.remove(menuHapus);
                        daftarPesanan.remove(menuHapus);
                        System.out.println("🗑️ Pesanan '" + menuHapus + "' berhasil dihapus.");
                    } else {
                        System.out.println("❌ Gagal! Menu '" + menuHapus + "' tidak ditemukan dalam daftar.");
                    }
                    break;

                // --- BAGIAN 5: LOGIKA TAMPILKAN PESANAN ---
                case 3:
                    System.out.println("\n--- Daftar Semua Pesanan ---");
                    if (daftarPesanan.isEmpty()) {
                        System.out.println("Belum ada pesanan yang dicatat.");
                    } else {
                        // Loop melalui ArrayList untuk menampilkan pesanan secara berurutan
                        for (int i = 0; i < daftarPesanan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarPesanan.get(i));
                        }
                    }
                    System.out.println("----------------------------");
                    break;

                // --- BAGIAN 6: KELUAR DARI APLIKASI ---
                case 4:
                    isRunning = false; // Menghentikan loop while
                    System.out.println("Terima kasih telah menggunakan aplikasi. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka antara 1 sampai 4.");
                    break;
            }
        }
        
        scanner.close();
    }
}