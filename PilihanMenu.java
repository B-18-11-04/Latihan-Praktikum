/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum;

import java.util.Scanner;

/**
 *
 * @author bhasa
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan = 9;
        do{
            System.out.println("MENU LUAS BANGUN");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = masukan.nextInt();
            switch(pilihan){
                case 1 : luasPersegi() ;break;
                case 2 : luasPersegiPanjang() ;break;
            }
            }while(pilihan != 3);
            }
    private static void luasPersegi(){
        Scanner masukan = new Scanner(System.in);
        float sisi,luas;
        System.out.print("Masukkan Nilai Sisi : ");
        sisi = masukan.nextFloat();
        luas = sisi * sisi;
        System.out.println("Luas Persegi Adalah : "+luas); 
    }
    private static void luasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in);
        float lebar,luas,panjang;
        System.out.print("Masukkan Nilai Lebar : ");
        lebar = masukan.nextFloat();
        System.out.print("Masukkan Nilai Panjang : ");
        panjang = masukan.nextFloat();
        luas = lebar * panjang;
        System.out.println("Luas Persegi Panjang Adalah : "+luas);
    }
}