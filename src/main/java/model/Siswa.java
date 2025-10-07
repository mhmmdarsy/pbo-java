/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Siswa {
    private int id;
    private String nama;
    private String kelas;

    public Siswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getKelas() { return kelas; }

    public void setId(int id) { this.id = id; }
    public void setNama(String nama) { this.nama = nama; }
    public void setKelas(String kelas) { this.kelas = kelas; }
}
