public class obat {
    private String nama;
    private String jenis;
    private double harga;

    // Constructor 1: tanpa parameter
    public obat() {
        this.nama = "Tidak diketahui";
        this.jenis = "Tidak diketahui";
        this.harga = 0.0;
    }

    // Constructor 2: dengan parameter nama dan jenis
    public obat(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = 0.0;
    }

    // Constructor 3: dengan parameter nama, jenis, dan harga
    public obat(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    // Method overloading: tampilkan info tanpa parameter
    public void tampilkanInfo() {
        System.out.println("Nama Obat: " + nama);
        System.out.println("Jenis Obat: " + jenis);
        System.out.println("Harga Obat: Rp " + harga);
    }

    // Method overloading: tampilkan info dengan tambahan keterangan
    public void tampilkanInfo(String keterangan) {
        System.out.println("=== " + keterangan + " ===");
        System.out.println("Nama Obat: " + nama);
        System.out.println("Jenis Obat: " + jenis);
        System.out.println("Harga Obat: Rp " + harga);
    }

    public static void main(String[] args) {
        // Membuat 3 objek Obat dengan constructor berbeda
        obat obat1 = new obat();
        obat obat2 = new obat("Paracetamol", "Tablet");
        obat obat3 = new obat("Amoxicillin", "Kapsul", 15000);

        // Menampilkan info obat dengan method overloading
        obat1.tampilkanInfo();
        System.out.println();

        obat2.tampilkanInfo("Informasi Obat 2");
        System.out.println();

        obat3.tampilkanInfo();
    }
}
