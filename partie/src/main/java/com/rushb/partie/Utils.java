package com.rushb.partie;

public class Utils {
    public static void afficherDes(int[] des) {
        System.out.print("Dés: ");
        for (int i = 0; i < des.length; i++) {
            System.out.print(des[i] + " ");
        }
        System.out.println();
    }
}
