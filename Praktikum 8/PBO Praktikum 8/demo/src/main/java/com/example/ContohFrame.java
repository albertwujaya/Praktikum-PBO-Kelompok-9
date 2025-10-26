package com.example;
import javax.swing.JFrame;

public class ContohFrame{
    public static void main(String[] args) {
        // Membuat sebuah JFrame
        JFrame frame = new JFrame("Contoh Frame");

        // Mengatur ukuran dan tampilan JFrame
        frame.setSize(400, 300);

        // Mengatur JFrame saat window ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setVisible(true);

        // Opsional: menempatkan frame di tengah layar
        frame.setLocationRelativeTo(null);
    }
}