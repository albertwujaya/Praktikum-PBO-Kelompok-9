package latihanprktikum8;

import java.awt.*;
import javax.swing.*;

public class KalkulatorModern extends JFrame {
    
    private JTextField display;
    private JLabel labelOperasi;
    private double angka1 = 0;
    private String operasi = "";
    
    public KalkulatorModern() {
        // Setup JFrame 
        setTitle("Calculator");
        setSize(380, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(30, 35, 50));
        
        // Label untuk menampilkan operasi (di atas display)
        labelOperasi = new JLabel("");
        labelOperasi.setBounds(30, 10, 320, 25);
        labelOperasi.setFont(new Font("Arial", Font.PLAIN, 16));
        labelOperasi.setForeground(new Color(150, 150, 150));
        labelOperasi.setHorizontalAlignment(JLabel.RIGHT);
        add(labelOperasi);
        
        // Display
        display = new JTextField("0");
        display.setBounds(30, 35, 320, 75);
        display.setFont(new Font("Arial", Font.BOLD, 40));
        display.setBackground(new Color(30, 35, 50));
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder());
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display);
        
        // Warna tombol
        Color warnaAngka = new Color(45, 52, 70);
        Color warnaOperasi = new Color(55, 65, 90);
        Color warnaBiru = new Color(40, 150, 255);
        
        // Baris 1
        buatTombol("AC", 30, 140, 75, 65, new Color(70, 50, 80), e -> {
            display.setText("0");
            angka1 = 0;
            operasi = "";
            labelOperasi.setText(""); // Reset label operasi
        });
        buatTombol("Del", 115, 140, 75, 65, warnaOperasi, e -> {
            String text = display.getText();
            if(text.length() > 1) {
                display.setText(text.substring(0, text.length() - 1));
            } else {
                display.setText("0");
            }
        });
        buatTombol("÷", 200, 140, 75, 65, warnaOperasi, e -> simpanOperasi("÷"));
        buatTombol("×", 285, 140, 75, 65, warnaOperasi, e -> simpanOperasi("×"));
        
        // Baris 2
        buatTombol("7", 30, 215, 75, 65, warnaAngka, e -> tambahAngka("7"));
        buatTombol("8", 115, 215, 75, 65, warnaAngka, e -> tambahAngka("8"));
        buatTombol("9", 200, 215, 75, 65, warnaAngka, e -> tambahAngka("9"));
        buatTombol("−", 285, 215, 75, 65, warnaOperasi, e -> simpanOperasi("−"));
        
        // Baris 3
        buatTombol("4", 30, 290, 75, 65, warnaAngka, e -> tambahAngka("4"));
        buatTombol("5", 115, 290, 75, 65, warnaAngka, e -> tambahAngka("5"));
        buatTombol("6", 200, 290, 75, 65, warnaAngka, e -> tambahAngka("6"));
        buatTombol("+", 285, 290, 75, 65, warnaOperasi, e -> simpanOperasi("+"));
        
        // Baris 4
        buatTombol("1", 30, 365, 75, 65, warnaAngka, e -> tambahAngka("1"));
        buatTombol("2", 115, 365, 75, 65, warnaAngka, e -> tambahAngka("2"));
        buatTombol("3", 200, 365, 75, 65, warnaAngka, e -> tambahAngka("3"));
        
        // Baris 5
        buatTombol("0", 30, 440, 160, 65, warnaAngka, e -> tambahAngka("0"));
        buatTombol(".", 200, 440, 75, 65, warnaAngka, e -> {
            if(!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        });
        
        // Tombol = (tinggi 2 baris)
        buatTombol("=", 285, 365, 75, 140, warnaBiru, e -> hitung());
        
        setVisible(true);
    }
    
    // Method untuk membuat tombol
    private void buatTombol(String text, int x, int y, int w, int h, Color warna, java.awt.event.ActionListener aksi) {
        JButton btn = new JButton(text);
        btn.setBounds(x, y, w, h);
        btn.setFont(new Font("Arial", Font.BOLD, 24));
        btn.setBackground(warna);
        btn.setForeground(Color.WHITE);
        btn.setFocusable(false);
        btn.setBorder(BorderFactory.createLineBorder(new Color(20, 25, 35), 5));
        btn.addActionListener(aksi);
        add(btn);
    }
    
    // Method untuk menambah angka ke display
    private void tambahAngka(String angka) {
        if(display.getText().equals("0")) {
            display.setText(angka);
        } else {
            display.setText(display.getText() + angka);
        }
    }
    
    // Method untuk menyimpan operasi
    private void simpanOperasi(String op) {
        angka1 = Double.parseDouble(display.getText());
        operasi = op;
        
        // Update label operasi untuk menampilkan angka dan operator
        String tampilAngka1 = (angka1 == (long) angka1) ? 
            String.valueOf((long) angka1) : String.valueOf(angka1);
        labelOperasi.setText(tampilAngka1 + " " + operasi);
        
        display.setText("0");
    }
    
    // Method untuk menghitung hasil
    private void hitung() {
        double angka2 = Double.parseDouble(display.getText());
        double hasil = 0;
        
        // Tampilkan operasi lengkap sebelum menghitung
        String tampilAngka1 = (angka1 == (long) angka1) ? 
            String.valueOf((long) angka1) : String.valueOf(angka1);
        String tampilAngka2 = (angka2 == (long) angka2) ? 
            String.valueOf((long) angka2) : String.valueOf(angka2);
        labelOperasi.setText(tampilAngka1 + " " + operasi + " " + tampilAngka2 + " =");
        
        if(operasi.equals("+")) {
            hasil = angka1 + angka2;
        } else if(operasi.equals("−")) {
            hasil = angka1 - angka2;
        } else if(operasi.equals("×")) {
            hasil = angka1 * angka2;
        } else if(operasi.equals("÷")) {
            if(angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                display.setText("Error");
                labelOperasi.setText("");
                return;
            }
        }
        
        // Format hasil
        if(hasil == (long) hasil) {
            display.setText(String.valueOf((long) hasil));
        } else {
            display.setText(String.valueOf(hasil));
        }
        
        // Reset operasi untuk perhitungan selanjutnya
        operasi = "";
        angka1 = hasil;
    }
    
    public static void main(String[] args) {
        new KalkulatorModern();
    }
}