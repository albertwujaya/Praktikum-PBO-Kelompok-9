package com.example;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
        
public class JButton {
    //Button dengan teks
    JButton button1 = new JButton("Klik Saya");
    // Button dengan gambar
    ImageIcon icon = new ImageIcon("icon.png");
    JButton button2 = new JButton(icon);
    // Button dengan teks dan Gambar
    JButton button3 = new JButton("Submit", icon);

    
    
    
}
