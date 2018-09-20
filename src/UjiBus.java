/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
public class UjiBus {
    public static void main (String[] arg) {
        Bus busMini = new Bus();
        
        System.out.println("Alfina Hidayati / X RPL 6 / 06");
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        busMini.cetak();
        busMini.penumpang = busMini.penumpang + 5;
        
        busMini.cetak();
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
    }    
}
    

