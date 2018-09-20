/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
public class UjiPraktikum1 {
    public static void main(String[] abc)
   {
       
    TugasPraktikum1 Bus = new TugasPraktikum1(5);
    
    System.out.println("Alfina Hidayati / X RPL 6 / 06");
    Bus.getPenumpang(17);
    Bus.getPenumpang(24);
    Bus.cetakPenumpang();
    
    Bus.addPenumpang(2);
    Bus.cetakPenumpang();
    
    
    Bus.addPenumpang (1);
    Bus.cetakPenumpang();
    
    Bus.addPenumpang (2);
    Bus.cetakPenumpang();
    
    Bus.addPenumpang (2);
    Bus.cetakPenumpang();
    
    Bus.setBB(1000);
    Bus.setJumlahpenumpang(10);
    Bus.getAverage();
       
    
    
   }
}
    