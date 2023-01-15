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
public abstract class Aku {
    protected String Nama;
    protected int NIM;
    
    public Aku(String Nama, int NIM){
   this.Nama = Nama;
   this.NIM = NIM;
}
    public abstract void getinfo();
    
}
