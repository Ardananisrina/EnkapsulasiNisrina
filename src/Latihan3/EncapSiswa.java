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
public class EncapSiswa {
    private String name;
    private String address;
    private int absent;
    
    public int getAbsent(){
        return absent;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAbsent(int newAbsent){
        absent = newAbsent;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
}
