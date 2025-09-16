/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus GK
 */
// ini adalah subclass dari superclass Pekerja
public class Guru extends Pekerja {
    
    public Guru(String nama, double gaji){
        super(nama, gaji);
    }
    
    public void mengajar(){
        System.out.println(nama + " sedang mengajar di kelas.");
    }
}