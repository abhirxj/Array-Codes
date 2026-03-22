package org.example;

import java.util.*;

public class FoodStamp {

    static class Food{
        long taste;
        long decrease;

        Food(long t,long d){
            this.taste = t;
            this.decrease = d;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Long m = sc.nextLong();

        long[] v = new long[n];
        long[] d = new long[n];

        for(int i=0;i<n;i++){
            v[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            d[i] = sc.nextLong();
        }
        PriorityQueue<Food> pq = new PriorityQueue<>((a,b) -> Long.compare(b.taste,a.taste)
                                                    );

        for(int i=0;i<n;i++){
            if(v[i] > 0)
                pq.add(new Food(v[i],d[i]));
        }
        long total = 0;
        while( m > 0 && !pq.isEmpty()){
            Food top = pq.poll();

            if(top.taste <= 0)  break;

            total += top.taste;

            long next = top.taste-top.decrease;

            if(next > 0)
                pq.add(new Food(next,top.decrease));

            m--;
        }
        System.out.println(total);
    }
}
