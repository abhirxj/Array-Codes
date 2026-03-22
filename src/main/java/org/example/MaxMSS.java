package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class MaxMSS {

    private static  void maxMSS(int n,int s,int[] arr){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        maxMSS(n,s,arr);
    }
}
