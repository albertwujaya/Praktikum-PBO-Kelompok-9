/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class ContohTextField {
    // TextField kosong dengan lebar 20 chara
    JTextField textField1 = new JTextField(20);
    // TextField Default
    JTextField textField2 = new JTextField("Teks Default");
    // TextFIeld dengan teks dan lebar
    JTextField textField3 = new JTextField("Hello",20);
    // Mendapatkan text dari field
    String inputText = textField1.getText();
    
}
