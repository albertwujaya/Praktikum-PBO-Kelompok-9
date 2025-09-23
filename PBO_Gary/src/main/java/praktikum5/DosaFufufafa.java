package praktikum5;

public class DosaFufufafa {

    private String menghinaPrabowo;
    private String pelecehan;
    private String antiKritik;

    // Constructor
    // Tanpa parameter
    public DosaFufufafa() {
        this.menghinaPrabowo = "Tentara pecatan, cerai, anak melambai";
        this.pelecehan = "Syahrini ****";
        this.antiKritik = "Sini lo nj*ng, gw ga ngumpet";
    }

    // Constructor Overloading
    //  Satu parameter
    public DosaFufufafa(String pelecehan) {
        this.menghinaPrabowo = "Titiekkk kembalilah ke pelukanku";
        this.pelecehan = pelecehan;
        this.antiKritik = "Iye iye gw nangis, sampe nangis ini ngelihat kebodohan lo";
    }

    // Tiga parameter
    public DosaFufufafa(String menghinaPrabowo, String pelecehan, String antiKritik) {
        this.menghinaPrabowo = menghinaPrabowo; //
        this.pelecehan = pelecehan;
        this.antiKritik = antiKritik;
    }

    // Method Overloading
    // Tanpa parameter
    public void tampilkanDosa() {
        System.out.println("--- Dosa Fufufafa Terungkap ---");
        System.out.println("Menghina Prabowo: " + this.menghinaPrabowo);
        System.out.println("Pelecehan       : " + this.pelecehan);
        System.out.println("Anti Kritik     : " + this.antiKritik);
        System.out.println();
    }

    // Method satu parameter
    public void tampilkanDosa(String pesanTambahan) {
        tampilkanDosa();
        System.out.println("Catatan Tambahan: " + pesanTambahan);
        System.out.println("---------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("MENCIPTAKAN 3 OBJEK DOSA FUFUFAFA...");
        System.out.println("====================================\n");

        // Objek 1 (constructor pertama)
        DosaFufufafa dosa1 = new DosaFufufafa();

        // Objek 2 (constructor kedua)
        DosaFufufafa dosa2 = new DosaFufufafa("Jadi pengen megang ****");

        // Objek 3 (constructor ketiga)
        DosaFufufafa dosa3 = new DosaFufufafa(
                "Oh nasibmu om wowo",
                "Nikita Mirzani...",
                "Netizen kalau komen tolol semua"
        );

        // Memanggil method dari objek 1
        System.out.println(">>> OBJEK 1 (Default):");
        dosa1.tampilkanDosa();

        // Memanggil method dari objek 2
        System.out.println(">>> OBJEK 2 (Custom Pelecehan):");
        dosa2.tampilkanDosa();

        // Memanggil method dari objek 3 dan menggunakan method overloading
        System.out.println(">>> OBJEK 3 (Full Custom + Pesan Tambahan):");
        dosa3.tampilkanDosa("Dosa-dosa ini diambil dari laman akun Fufufafa.");
    }
}