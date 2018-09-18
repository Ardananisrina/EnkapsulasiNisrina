/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Nisrina Izdihar
 */
public class UjiBus {
    public static void main(String[] args){
        //membuat objek busMini dari kelas Bus
        Bus busmini = new Bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal 
        //ke dalam objek busMini
        busmini.penumpang = 5;
        busmini.maxPenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
        
        //menambahkan penumpang pada busMini
        busmini.penumpang = busmini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busmini.penumpang = busmini.penumpang - 2;
        busmini.cetak();
        
        busmini.penumpang = busmini.penumpang + 8;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
    }
    
}
