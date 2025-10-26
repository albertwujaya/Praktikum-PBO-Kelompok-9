package com.github.albertwujaya.praktikum.pbo;

public class Main {
    public static void main(String[] args) {
        String nama = "Albert Wujaya";
        long NIM = 2407114002L;
        int umur = 19;
        String alamat = "Jalan Elang Sakti N0.2";
        final String golonganDarah = "O";
        double[] ip = {3.67, 3.77};
        float ip2Float = (float) ip[1];

        System.out.println("         ---Biodata---   ");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + NIM);
        System.out.println("Umur            : "+ umur);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Golongan Darah  : " + golonganDarah);
        System.out.println("IP 1            : " + ip[0]);
        System.out.println("IP 2            : " + ip[1]);
        System.out.println("IP 2 Float      : " + ip2Float);
    }
}