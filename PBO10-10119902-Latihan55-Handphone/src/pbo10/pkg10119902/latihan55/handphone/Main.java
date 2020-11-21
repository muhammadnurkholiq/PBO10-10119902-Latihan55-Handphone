/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan55.handphone;

/**
 *
 * @author 
 * Nama     : Muhammad Nurkholiq
 * Kelas    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Program Handphone
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("234ibfd3840fo");
        a.displayProduct();
        System.out.println("Android Key Store \t : " + a.getKeyStore());
        
        System.out.println();
        
        Blackberry b = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        b.setPinBB("BHS249");
        b.displayProduct();
        System.out.println("PIN : " + b.getPinBB());
        
        System.out.println();
        
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        w.setWpKeyStore("UUUQIJWORJ");
        w.displayProduct();
        System.out.println("Wp Key Store : " + w.getWpKeyStore());
    }
}