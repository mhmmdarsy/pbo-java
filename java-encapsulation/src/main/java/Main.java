

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus GK
 */
public class Main {
    public static void main(String[] args) {
        
//      membuat objek Pekerja
        Pekerja p1 = new Pekerja("Arsy", 8000000);
        
//        System.out.println("Nama: " + p1.getNama());
//        System.out.println("Gaji: Rp" + p1.getGaji());
        
//        System.out.println();
//      menampilkan nama dengan getter
        System.out.println("Nama: " + p1.getNama() + "\nGaji: Rp" + p1.getGaji());
        
//      mengubah data menggunakan Setter
        p1.setNama("Ikmal");
        p1.setGaji(9000000);
        
        System.out.println();
        System.out.println("Data pekerja setelah diubah :");
        System.out.println("Nama: " + p1.getNama() + "\nGaji: Rp" + p1.getGaji());
        
    }
}
