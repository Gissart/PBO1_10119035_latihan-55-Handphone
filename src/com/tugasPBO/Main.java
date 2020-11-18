package com.tugasPBO;
/*
Nama      : Argya Aulia Fauzandika
NIM       : 10119035
Kelas     : PBO1 / IF1
Deskripsi : Menampilkan informasi mengenai handphone mulai dari manufaktur, os, model, dll
* */

public class Main {
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android","Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store   : "+ android.getKeyStore()+"\n");

        Blackberry bb = new Blackberry("BlackB","RIM","Curve",2000000);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN   : "+bb.getPinBB()+"\n");

        WindowsPhone wp = new WindowsPhone("Nokia", "Win8","Lumia",1000000);
        wp.displayProduct();
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store   : "+wp.getWpKeyStore());
    }

}
