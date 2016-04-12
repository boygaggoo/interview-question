package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double pos_num=0,neg_num=0,zero_num=0;
       for(int arr_i=0; arr_i < n; arr_i++){
        if(arr[arr_i]<0){
            neg_num+=1;
        }
         if(arr[arr_i]>0){
             pos_num+=1;
         }
           if(arr[arr_i]==0){
               zero_num+=1;
           }
       }
       System.out.println(pos_num);
        System.out.println(pos_num/n);
        System.out.println(neg_num/n);
         System.out.println(zero_num/n);
    }
}