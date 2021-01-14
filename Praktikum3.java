/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum;

/**
 *
 * @author bhasa
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("@");
        }
        System.out.println("");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i + j == 3 + 1) {
                    System.out.print(" @");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("@");
        }
        System.out.println("");
    }
}
