/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

import java.util.Arrays;
/**
 *
 * @author student
 */
public class Massiivid {
    public static int summa(int[] arvud){
        int summa = 0;
        for (int i = 0; i < arvud.length; i++) {
            summa+=arvud[i];
        }
        return summa;
    }
    public static void main(String[] args) {
        int[] pikkused={176, 163, 158, 171, 169};
        System.out.println(summa(pikkused));
        System.out.println("Kokku: "+pikkused.length);
        System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
        for (int i = 0; i < pikkused.length; i++) {
            System.out.println(pikkused[i]);
        }
        int summa=0;
        for (int i = 0; i < pikkused.length; i++) {
            summa+=pikkused[i];
        }
        System.out.println(summa);
        System.out.println(Arrays.stream(pikkused).sum());
    }
}
