package praktikum2;

public class LatihanBab2 {

	public static void main(String[] args) {
		
		//deklarasi dan sekaligus inisialisasi variabel
        String nama = "Gary Andreas";
        final long nim = 2407114280L;
        double[] ip = {3.55, 2.65};
        int umur = 21;
        char goldar = 'O';
        String alamat = "Jalan HR. Soebrantas";
        byte ipByte = (byte) ip[0];

        //print biodata
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("IP Semester 1: "+ ip[0]);
        System.out.println("IP Semester 2: "+ ip[1]);
        System.out.println("IP Semester 1 dalam Byte: "+ ipByte);
        System.out.println("Alamat: "+ alamat);
        System.out.println("Umur: "+ umur);
        System.out.println("Golongan darah: "+ goldar);
    
	}

}
