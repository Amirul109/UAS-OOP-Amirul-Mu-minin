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
public class DataDiri extends Aku{
    protected int Umur;
    
    public DataDiri (String Nama,int NIM ,int Umur){
        super(Nama,NIM);
        this.Umur = Umur;
}
 @Override
 public void getinfo(){
     System.out.println("Nama : "+Nama);
     System.out.println("NIM : "+NIM);
     System.out.println("Usia : "+Umur);
 }
     
 }