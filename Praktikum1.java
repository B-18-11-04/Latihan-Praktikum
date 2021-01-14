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
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 1 || i == 4 || j == 0 || j == 3) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
