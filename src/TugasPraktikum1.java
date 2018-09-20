/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
import java.io.*;

public class TugasPraktikum1 {
         public int penumpang;
    public int maxPenumpang;
    private double average;
    private double jumlahpenumpang;
    private double BB;
    
    public TugasPraktikum1(int maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
        
        public void addPenumpang(int penumpang){
        
            int temp;
            temp = this.penumpang+penumpang;
            if (temp> maxPenumpang)
            {
                System.out.println("Penumpang melebihi kuota");
                
            }
            else
            {
                this.penumpang=temp;
            }
        }
        public void getPenumpang(int password)
        {
            if (password==24)
            {
                System.out.println("Password Benar");
            }
            else
            {
                System.out.println("Password Salah");
            }
        }
        
    public void cetakPenumpang()
    {System.out.println("Penumpang bus sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+ maxPenumpang);
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

    public double getAverage() {
        average = BB/jumlahpenumpang;
        System.out.println("rata rata"+average);
        return average;
    }

    public double getJumlahpenumpang() {
        return jumlahpenumpang;
    }

    public double getBB() {
        return BB;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setJumlahpenumpang(double jumlahpenumpang) {
        this.jumlahpenumpang = jumlahpenumpang;
    }

    public void setBB(double BB) {
        this.BB = BB;
    }
        
}