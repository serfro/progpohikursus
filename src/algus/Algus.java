/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 *
 * @author student
 */
public class Algus {

    /**
     * @param args the command line arguments
     */
    public static void ilmaKommentaar(int temperatuur) {
        if(temperatuur>0)
            System.out.println("sulab");
        else
            System.out.println("Jäätab");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, Web!");
        ilmaKommentaar(3);
    }
}
