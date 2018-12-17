/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadwalidin.latihanmvc.controller;

import edu.muhammadwalidin.latihanmvc.model.PelangganModel;
import edu.muhammadwalidin.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad
 * NIM   : 10117094
 * Nama  : Muhammad Walidin
 * Kelas : IF-3
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")){
            
        }else {
            
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Email Masih Kosong");
        }else if(noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view,"No Telepon Masih Kosong");
        }else {
            model.simpanForm();
        }
    }
    
}
