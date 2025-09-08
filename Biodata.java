public class Biodata 
{
   
    public static void main(String[] args) 
    {
        //deklarasi dan sekaligus inisialisasi variabel
        String nama = "Farhan Eka Yuda";
        final long NIM = 2407111187L;
        double[] ip = {3.9, 3.74};
        int umur = 20;
        char golonganDarah = 'O';
        String alamat = "Jalan Sudirman";
        byte ipByte = (byte) ip[0];

        //print biodata
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ NIM);
        System.out.println("IP Semester 1: "+ ip[0]);
        System.out.println("IP Semester 2: "+ ip[1]);
        System.out.println("IP Semester 1 dalam Byte: "+ ipByte);
        System.out.println("Alamat: "+ alamat);
        System.out.println("Umur: "+ umur);
        System.out.println("Golongan darah: "+ golonganDarah);
    
    }
}
