/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author Nisrina Izdihar
 */
public class Bus4 {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    
    //konstruksi kelas Bus4
    public Bus4(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang malebihi kuota");
            }else{
            this.penumpang = temp;
            counter++;
        }
    }
    public void getPenumpang(int password){
        if(password == 24){
            System.out.println("Password benar");
        }
        else{
            System.out.println("Password salah");
        }
    }
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){
        System.out.println("penumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxPenumpang);
    }
    
}
