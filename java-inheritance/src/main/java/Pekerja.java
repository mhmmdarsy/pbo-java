/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus GK
 */

// ini adalah superclass
public class Pekerja {
    String nama;
    double gaji;
    
//  membuat constructor
    public Pekerja(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void bekerja(){
        System.out.println(nama + " sedang sibuk bekerja.");
    }
    
    public void istirahat(){
        System.out.println(nama + " sedang beristirahat.");
    }
}