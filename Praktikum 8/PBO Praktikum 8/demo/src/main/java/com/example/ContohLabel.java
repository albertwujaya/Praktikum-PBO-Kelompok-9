package com.example;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ContohLabel {

    public static void main(String[] args) {
        // Membuat sebuah JFrame
        JFrame frame = new JFrame("Contoh Label");

        // Mengatur ukuran dan tampilan JFrame
        frame.setSize(400, 300);

        // PENTING: Mengatur layout manager
        frame.setLayout(new FlowLayout());

        // Label dengan teks
        JLabel label1 = new JLabel("Nama : ");
        
        // Label dengan teks alignment
        JLabel label2 = new JLabel("Selamat Datang di Java Swing", SwingConstants.CENTER);

        // Label dengan gambar
        ImageIcon icon = new ImageIcon("path/to/your/image.png"); // Ganti dengan path gambar yang valid
        JLabel label3 = new JLabel(icon);

        // Label dengan teks dan gambar
        JLabel label4 = new JLabel("User", icon, SwingConstants.LEFT);

        // Mengubah teks label1
        label1.setText("Username : ");

        // Mengubah font dan warna label1
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label1.setForeground(Color.BLUE);
        
        // Menambahkan label ke JFrame
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        // Mengatur JFrame saat window ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setVisible(true);
    }
}