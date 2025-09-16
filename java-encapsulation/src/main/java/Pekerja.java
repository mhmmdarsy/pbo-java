/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus GK
 */
public class Pekerja {
    private String nama;
    private double gaji;

    public Pekerja(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(double gaji) {
        if (gaji >= 1500000) {
            this.gaji = gaji;
        } else {
            System.out.println("Gaji pekerja minimal Rp1.500.000");
        }
    }
}
