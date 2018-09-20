/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Fina");
        siswa.setAbsen(06);
        siswa.setAddress("Malang");
                
        System.out.println("Alfina Hidayati / X RPL 6 / 6");
        System.out.println("Nama : " + siswa.getName()
        + " Absen : " + siswa.getAbsen() + " Address : " + siswa.getAddress());
              
        
    }
    
}
    

