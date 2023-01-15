/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Amir
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Utama {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("TUGAS UAS OOP");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLayout (new FlowLayout());
        
        JButton klik = new JButton ("Jalankan");
        frame.add (klik);
                
        klik.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                DataDiri DataDiri = new DataDiri ("Amirul Mu'minin", 312110109, 25);
                DataDiri.getinfo();
                Jus Jus = new Jus("Teknik Informatika", 3);
                Jus.setDataDiri(DataDiri);
            
                System.out.println ("Program Studi : "+Jus.getNama());
                System.out.println ("Semester : "+Jus.getSem());
            }
        });
    
        frame.setVisible(true);
    }
}