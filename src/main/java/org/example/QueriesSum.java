package org.example;
import java.util.*;

public class QueriesSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        int[][] queries = new int[q][4];
        for(int i=0;i<q;i++){

            for(int j=0;j<4;j++){
                queries[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i< queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];
            int y = queries[i][3];
            int icnt=0;

            for(int j=l;j<=r;j++){
                arr[j] = x+(y*icnt);
                icnt++;
            }
        }
        int ans=0;
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
            ans+=arr[i];
        }


        System.out.println("Ans:"+ans);
    }

}
