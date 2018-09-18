/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Nisrina Izdihar
 */
public class UjiBus3 {
    public static void main(String[] args){
        
        Bus3 Bus = new Bus3(5);
    Bus.getPenumpang(17);
    Bus.getPenumpang(24);
    Bus.cetakpenumpang();
    
        //penambahan penumpang
        Bus.addPenumpang(2);//menambahkan 15 penumpang
        Bus.cetakpenumpang();
        
        //penambahan jumlah penumpang
        Bus.addPenumpang(1);//menambahkan 5 penumpang
        Bus.cetakpenumpang();
        
        //penambahan jumlah penumpang
        Bus.addPenumpang(2);//menambahkan 26 penumpang
        Bus.cetakpenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakpenumpang();
    }

}
