package LATIHAN.Inheritance;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //buat looping untuk mengulang membuat objek cd atau dvd
        System.out.println("Berapa objek yang dibuat?(max 10)");
        int jumlah = in.nextInt();
        System.out.println("CD atau DVD");
        String pilihan = in.next();
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i);
            
            //kondisi
            if(pilihan.equals("CD")) {
                cd c1 = new cd();
                c1.print();
            }
            else if(pilihan.equals("DVD")) {
                dvd d1 = new dvd();
                d1.print();
            }else{
                System.out.println("Input Salah!");
            }
        }
            
    }
}
