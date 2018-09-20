/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
public class Bola {
    private double jarijari = 14;
   private double diameter;
   private double luas;
   private double volume;

   public void setJari(double jarijari){
   this.jarijari=jarijari;
   }
  
   public void showDiameter(){
   this.diameter=2*jarijari;
   }
  
   public void showLuas(){
   this.luas=4*Math.PI*jarijari*jarijari;
   }
  
   public void showVolume(){
   this.volume=(4*Math.PI*jarijari*jarijari*jarijari)/3;
   }
  
   public void cetak(){
   System.out.println("Alfina Hidayati / X RPL 6 / 06");
   System.out.println(">>>>>>>>>>>>BOLA<<<<<<<<<<<<");
   System.out.println("Jari-jari : "+jarijari+ " cm   ");
   System.out.println("Diameter  : "+diameter+ " cm   ");
   System.out.println("Luas      : "+luas+" cm kuadrat");
   System.out.println("Volume    : "+volume+" cm kubik");
   }
   }


