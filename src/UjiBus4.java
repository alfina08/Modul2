/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
public class UjiBus4 {
     public static void main(String[] abc)
   {
       
    Latihan4 Bus = new Latihan4(5);
    
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
    
    
   }
}
    
}
