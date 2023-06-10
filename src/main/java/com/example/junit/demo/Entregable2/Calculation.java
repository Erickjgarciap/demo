package com.example.junit.demo.Entregable2;

import java.util.StringTokenizer;

public class Calculation {

    public static int findMax(int arr[]){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    //Metodo que regresa el cubo de un numero
    public static int cube(int n){
        return n*n*n;
    }
    //metodo que regresa uuna palabra alreves
    public static String reverseWord(String str){

        StringBuilder result=new StringBuilder();
        StringTokenizer tokenizer=new StringTokenizer(str," ");

        while(tokenizer.hasMoreTokens()){
            StringBuilder sb=new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();
            result.append(sb);
            result.append(" ");
        }
        return result.toString();
    }
}
