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
    
    public static int[] piirid(int[] arvud){
        int[] vastus=new int[2];
        if(arvud==null){
            throw new RuntimeException("parameetri väärtus null");
        }
        if(arvud.length==0){
            throw new RuntimeException("parameetriks tühi massiiv");
        }
        vastus[0]=vastus[1]=arvud[0];//esimese arvu omistav vastuse m6lemale
        for(int arv: arvud){
            if(arv<vastus[0])
                vastus[0]=arv;
            if(arv>vastus[1])
                vastus[1]=arv;
        }
        return vastus;
    }
    
    
    
    
    public static int summa(int[] arvud){
        int summa = 0;
        for (int i = 0; i < arvud.length; i++) {
            summa+=arvud[i];
        }
        return summa;
    }
    public static double keskmine(int[] arvud){
       return summa(arvud)*1.0/arvud.length;
    }
    public static void main(String[] args) {
        int[] pikkused={176, 163, 158, 171, 169};
        int[] t = piirid(pikkused);
        System.out.println("suurim "+t[0]+ " ja " + "väiksem "+t[1]);
        System.out.println(summa(pikkused));
        System.out.println(keskmine(pikkused));
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

/*
suurim 158 ja väiksem 176
837
167.4
Kokku: 5
176 169
176
163
158
171
169
837
837
*/