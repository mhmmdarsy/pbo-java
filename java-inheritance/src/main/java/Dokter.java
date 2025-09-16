/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus GK
 */

// ini adalah subclass dari superclass Pekerja
public class Dokter extends Pekerja {
    
    public Dokter(String nama, double gaji){
        super(nama, gaji);
    }
    
    public void periksaPasien(){
        System.out.println(nama + "sedang memeriksa pasien.");
    }
    
    @Override
    public void bekerja(){
        super.bekerja();
        System.out.println(nama + "telah melakukan pemeriksaan kesehatan.");
    }
}
