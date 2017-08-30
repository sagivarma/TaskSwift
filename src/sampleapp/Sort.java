/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

import sun.security.util.Length;

/**
 *
 * @author ssvarma
 */
public class Sort {

    public static void main(String[] args) {
        int var[] = {2, 5, 6,8,6};

        int templength=var.length;
        int count=var.length;
        for (int i = 0; i < var.length; i++) {
//            System.out.println(var[i]);
            for (int j = 0; j < templength; j++) {
                if(i!=j && var[i]==var[j] ){
//                    System.out.println(var[i]);
                    count--;
                    templength=templength-1;
//                    System.out.println(templength);
                    int temp=var[j];
                    var[j]=var[templength];
                    var[templength]=temp;
                }
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.println(var[i]);
        }


    }

}
