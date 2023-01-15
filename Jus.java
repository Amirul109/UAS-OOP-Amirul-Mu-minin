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
public class Jus {
    private String Nama;
    private int Sem;
    private DataDiri DataDiri;
    
    public Jus(String Nama, int Sem){
        this.Nama=Nama;
        this.Sem=Sem;
    }
    
public void setDataDiri(DataDiri DataDiri){
    this.DataDiri = DataDiri;
}
public String getNama(){
    return Nama;
}
public int getSem(){
    return Sem;
}
}