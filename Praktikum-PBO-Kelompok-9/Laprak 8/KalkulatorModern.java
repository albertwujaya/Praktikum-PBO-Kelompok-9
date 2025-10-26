import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class KalkulatorModern extends JFrame {
    
    private JTextField display;
    private JLabel labelOperasi;
    private double angka1 = 0;
    private String operasi = "";
    
    public KalkulatorModern() {
        // Setup JFrame dengan gradient background
        setTitle("Calculator Pro");
        setSize(400, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        // Panel dengan gradient background
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                // Gradient dari hitam lembut ke abu gelap
                GradientPaint gp = new GradientPaint(0, 0, new Color(20, 20, 25), 
                                                     0, getHeight(), new Color(35, 35, 40));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setBounds(0, 0, 400, 680);
        mainPanel.setLayout(null);
        add(mainPanel);
        
        // Label untuk menampilkan operasi
        labelOperasi = new JLabel("");
        labelOperasi.setBounds(35, 20, 330, 30);
        labelOperasi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        labelOperasi.setForeground(new Color(140, 140, 145));
        labelOperasi.setHorizontalAlignment(JLabel.RIGHT);
        mainPanel.add(labelOperasi);
        
        // Display dengan efek glow
        display = new JTextField("0") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Background
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                
                // Glow effect display orange
                g2.setColor(new Color(255, 149, 0, 35));
                g2.setStroke(new BasicStroke(3));
                g2.drawRoundRect(1, 1, getWidth()-2, getHeight()-2, 20, 20);
                
                super.paintComponent(g);
                g2.dispose();
            }
        };
        display.setBounds(35, 55, 330, 90);
        display.setFont(new Font("Segoe UI", Font.BOLD, 48));
        display.setBackground(new Color(25, 25, 30));
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setOpaque(false);
        mainPanel.add(display);
        
        // Warna tombol - Tema Minimalis Clean (Gray & Orange)
        Color warnaAngka = new Color(50, 50, 55);  // Dark gray
        Color warnaOperasi = new Color(255, 149, 0);  // Soft orange
        Color warnaACDel = new Color(65, 65, 70);  // Medium gray
        Color biruGelap = new Color(30, 30, 35);  // Very dark gray
        Color warnaSamping = new Color(255, 149, 0);  // Soft orange
        Color warnaEquals = new Color(255, 149, 0);  // Soft orange accent
        
        // Baris 1
        buatTombolKuadrat(35, 170, 80, 70, warnaACDel, mainPanel);
        buatTombolAkar(125, 170, 80, 70, warnaACDel, mainPanel);
        buatTombol("÷", 215, 170, 80, 70, warnaOperasi, biruGelap, mainPanel, e -> simpanOperasi("÷"));
        buatTombol("×", 305, 170, 80, 70, warnaOperasi, biruGelap, mainPanel, e -> simpanOperasi("×"));
        
        // Baris 2
        buatTombol("AC", 35, 250, 80, 70, warnaACDel, Color.WHITE, mainPanel, e -> {
            display.setText("0");
            angka1 = 0;
            operasi = "";
            labelOperasi.setText("");
        });
        buatTombolDelete(125, 250, 80, 70, warnaACDel, mainPanel);
        buatTombol("9", 215, 250, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("9"));
        buatTombol("−", 305, 250, 80, 70, warnaOperasi, biruGelap, mainPanel, e -> simpanOperasi("−"));
        
        // Baris 3
        buatTombol("7", 35, 330, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("7"));
        buatTombol("8", 125, 330, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("8"));
        buatTombol("6", 215, 330, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("6"));
        buatTombol("+", 305, 330, 80, 70, warnaOperasi, biruGelap, mainPanel, e -> simpanOperasi("+"));
        
        // Baris 4
        buatTombol("4", 35, 410, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("4"));
        buatTombol("5", 125, 410, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("5"));
        buatTombol("3", 215, 410, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("3"));
        
        // Baris 5
        buatTombol("1", 35, 490, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("1"));
        buatTombol("2", 125, 490, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("2"));
        buatTombol(".", 215, 490, 80, 70, warnaAngka, warnaSamping, mainPanel, e -> {
            if(!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        });
        
        // Baris 6
        buatTombol("0", 35, 570, 170, 70, warnaAngka, warnaSamping, mainPanel, e -> tambahAngka("0"));
        
        // Tombol = (tinggi 2 baris) dengan efek glow
        buatTombolEquals(305, 410, 80, 230, warnaEquals, mainPanel);
        
        setVisible(true);
    }
    
    // Method untuk membuat tombol dengan efek 3D dan hover
    private void buatTombol(String text, int x, int y, int w, int h, Color warna, Color warnaText, JPanel panel, java.awt.event.ActionListener aksi) {
        JButton btn = new JButton(text) {
            private boolean hover = false;
            
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Shadow effect
                g2.setColor(new Color(0, 0, 0, 50));
                g2.fillRoundRect(2, 4, getWidth()-2, getHeight()-2, 25, 25);
                
                // Gradient background
                GradientPaint gp;
                if(hover) {
                    gp = new GradientPaint(0, 0, brighten(getBackground(), 1.2f), 
                                          0, getHeight(), getBackground());
                } else {
                    gp = new GradientPaint(0, 0, brighten(getBackground(), 1.1f), 
                                          0, getHeight(), getBackground());
                }
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth()-2, getHeight()-4, 25, 25);
                
                // Border highlight
                g2.setColor(new Color(255, 255, 255, 20));
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawRoundRect(1, 1, getWidth()-4, getHeight()-6, 25, 25);
                
                // Text
                g2.setColor(getForeground());
                g2.setFont(getFont());
                FontMetrics fm = g2.getFontMetrics();
                int textX = (getWidth() - fm.stringWidth(getText())) / 2;
                int textY = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
                g2.drawString(getText(), textX, textY - 2);
                
                g2.dispose();
            }
        };
        
        btn.setBounds(x, y, w, h);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 26));
        btn.setBackground(warna);
        btn.setForeground(warnaText);
        btn.setFocusable(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.repaint();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.repaint();
            }
        });
        
        btn.addActionListener(aksi);
        panel.add(btn);
    }
    
    // Method untuk tombol = dengan glow effect
    private void buatTombolEquals(int x, int y, int w, int h, Color warna, JPanel panel) {
        JButton btn = new JButton("=") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Glow effect dengan warna orange lembut
                for(int i = 8; i > 0; i--) {
                    g2.setColor(new Color(255, 149, 0, 10));
                    g2.fillRoundRect(-i, -i, getWidth()+i*2-2, getHeight()+i*2-4, 25+i, 25+i);
                }
                
                // Shadow
                g2.setColor(new Color(0, 0, 0, 80));
                g2.fillRoundRect(2, 4, getWidth()-2, getHeight()-2, 25, 25);
                
                // Gradient background
                GradientPaint gp = new GradientPaint(0, 0, brighten(getBackground(), 1.3f), 
                                                     0, getHeight(), getBackground());
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth()-2, getHeight()-4, 25, 25);
                
                // Highlight border
                g2.setColor(new Color(255, 255, 255, 40));
                g2.setStroke(new BasicStroke(2));
                g2.drawRoundRect(1, 1, getWidth()-4, getHeight()-6, 25, 25);
                
                // Text with shadow
                g2.setColor(new Color(0, 0, 0, 100));
                g2.setFont(getFont());
                FontMetrics fm = g2.getFontMetrics();
                int textX = (getWidth() - fm.stringWidth(getText())) / 2;
                int textY = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
                g2.drawString(getText(), textX+1, textY-1);
                
                g2.setColor(getForeground());
                g2.drawString(getText(), textX, textY - 2);
                
                g2.dispose();
            }
        };
        
        btn.setBounds(x, y, w, h);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 36));
        btn.setBackground(warna);
        btn.setForeground(Color.WHITE);
        btn.setFocusable(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(e -> hitung());
        panel.add(btn);
    }
    
    // Method untuk tombol Delete
    private void buatTombolDelete(int x, int y, int w, int h, Color warna, JPanel panel) {
        JButton btn = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Shadow
                g2.setColor(new Color(0, 0, 0, 50));
                g2.fillRoundRect(2, 4, getWidth()-2, getHeight()-2, 25, 25);
                
                // Gradient background
                GradientPaint gp = new GradientPaint(0, 0, brighten(getBackground(), 1.1f), 
                                                     0, getHeight(), getBackground());
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth()-2, getHeight()-4, 25, 25);
                
                // Border
                g2.setColor(new Color(255, 255, 255, 20));
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawRoundRect(1, 1, getWidth()-4, getHeight()-6, 25, 25);
                
                // Ikon backspace
                g2.setColor(getForeground());
                g2.setStroke(new BasicStroke(2.5f));
                
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2 - 2;
                
                int[] xPoints = {centerX - 12, centerX - 18, centerX - 12, centerX + 12, centerX + 12, centerX - 12};
                int[] yPoints = {centerY - 8, centerY, centerY + 8, centerY + 8, centerY - 8, centerY - 8};
                g2.drawPolyline(xPoints, yPoints, 6);
                
                g2.drawLine(centerX - 2, centerY - 4, centerX + 6, centerY + 4);
                g2.drawLine(centerX + 6, centerY - 4, centerX - 2, centerY + 4);
                
                g2.dispose();
            }
        };
        
        btn.setBounds(x, y, w, h);
        btn.setBackground(warna);
        btn.setForeground(Color.WHITE);
        btn.setFocusable(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(e -> {
            String text = display.getText();
            if(text.length() > 1) {
                display.setText(text.substring(0, text.length() - 1));
            } else {
                display.setText("0");
            }
        });
        panel.add(btn);
    }
    
    // Method untuk tombol Kuadrat
    private void buatTombolKuadrat(int x, int y, int w, int h, Color warna, JPanel panel) {
        JButton btn = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                
                // Shadow
                g2.setColor(new Color(0, 0, 0, 50));
                g2.fillRoundRect(2, 4, getWidth()-2, getHeight()-2, 25, 25);
                
                // Gradient background
                GradientPaint gp = new GradientPaint(0, 0, brighten(getBackground(), 1.1f), 
                                                     0, getHeight(), getBackground());
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth()-2, getHeight()-4, 25, 25);
                
                // Border
                g2.setColor(new Color(255, 255, 255, 20));
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawRoundRect(1, 1, getWidth()-4, getHeight()-6, 25, 25);
                
                // Gambar x²
                g2.setColor(getForeground());
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;
                
                g2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
                g2.drawString("x", centerX - 12, centerY + 5);
                
                g2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                g2.drawString("2", centerX + 5, centerY - 5);
                
                g2.dispose();
            }
        };
        
        btn.setBounds(x, y, w, h);
        btn.setBackground(warna);
        btn.setForeground(Color.WHITE);
        btn.setFocusable(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(e -> {
            double angka = Double.parseDouble(display.getText());
            double hasil = angka * angka;
            labelOperasi.setText(display.getText() + "² =");
            if(hasil == (long) hasil) {
                display.setText(String.valueOf((long) hasil));
            } else {
                display.setText(String.valueOf(hasil));
            }
        });
        panel.add(btn);
    }
    
    // Method untuk tombol Akar dengan ikon yang lebih baik
    private void buatTombolAkar(int x, int y, int w, int h, Color warna, JPanel panel) {
        JButton btn = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Shadow
                g2.setColor(new Color(0, 0, 0, 50));
                g2.fillRoundRect(2, 4, getWidth()-2, getHeight()-2, 25, 25);
                
                // Gradient background
                GradientPaint gp = new GradientPaint(0, 0, brighten(getBackground(), 1.1f), 
                                                     0, getHeight(), getBackground());
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth()-2, getHeight()-4, 25, 25);
                
                // Border
                g2.setColor(new Color(255, 255, 255, 20));
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawRoundRect(1, 1, getWidth()-4, getHeight()-6, 25, 25);
                
                // Gambar √ dengan bentuk yang lebih bagus
                g2.setColor(getForeground());
                g2.setStroke(new BasicStroke(2.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;
                
                // Buat path untuk simbol akar yang lebih smooth
                Path2D path = new Path2D.Float();
                path.moveTo(centerX - 14, centerY + 2);  // Kiri bawah
                path.lineTo(centerX - 8, centerY + 8);   // Titik V bawah
                path.lineTo(centerX - 2, centerY - 6);   // Titik tengah naik
                path.lineTo(centerX + 14, centerY - 6);  // Garis horizontal atas
                
                g2.draw(path);
                
                // Tambahkan garis horizontal di atas (overline)
                g2.setStroke(new BasicStroke(2.2f));
                g2.drawLine(centerX - 2, centerY - 6, centerX + 14, centerY - 6);
                
                g2.dispose();
            }
        };
        
        btn.setBounds(x, y, w, h);
        btn.setBackground(warna);
        btn.setForeground(Color.WHITE);
        btn.setFocusable(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(e -> {
            double angka = Double.parseDouble(display.getText());
            if(angka >= 0) {
                double hasil = Math.sqrt(angka);
                labelOperasi.setText("√" + display.getText() + " =");
                if(hasil == (long) hasil) {
                    display.setText(String.valueOf((long) hasil));
                } else {
                    display.setText(String.valueOf(hasil));
                }
            } else {
                display.setText("Error");
                labelOperasi.setText("");
            }
        });
        panel.add(btn);
    }
    
    // Helper method untuk brighten color
    private Color brighten(Color c, float factor) {
        int r = Math.min(255, (int)(c.getRed() * factor));
        int g = Math.min(255, (int)(c.getGreen() * factor));
        int b = Math.min(255, (int)(c.getBlue() * factor));
        return new Color(r, g, b);
    }
    
    private void tambahAngka(String angka) {
        if(display.getText().equals("0")) {
            display.setText(angka);
        } else {
            display.setText(display.getText() + angka);
        }
    }
    
    private void simpanOperasi(String op) {
        angka1 = Double.parseDouble(display.getText());
        operasi = op;
        
        String tampilAngka1 = (angka1 == (long) angka1) ? 
            String.valueOf((long) angka1) : String.valueOf(angka1);
        labelOperasi.setText(tampilAngka1 + " " + operasi);
        
        display.setText("0");
    }
    
    private void hitung() {
        double angka2 = Double.parseDouble(display.getText());
        double hasil = 0;
        
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
        
        if(hasil == (long) hasil) {
            display.setText(String.valueOf((long) hasil));
        } else {
            display.setText(String.valueOf(hasil));
        }
        
        operasi = "";
        angka1 = hasil;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KalkulatorModern());
    }
}