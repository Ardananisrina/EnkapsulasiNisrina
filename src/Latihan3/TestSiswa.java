/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Nisrina Izdihar
 */
public class TestSiswa {
    public static void main(String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Nisrina");
        siswa.setAbsent(32);
        siswa.setAddress("Malang");
        
        System.out.println("Name : " + siswa.getName() + " Absent : " + siswa.getAbsent() + " Address : " + siswa.getAddress());
    }
    
}
