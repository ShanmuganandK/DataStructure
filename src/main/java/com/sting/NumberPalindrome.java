package com.sting;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.stream.Collectors.joining;


public class NumberPalindrome {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());




        bufferedWriter.write(
                "Is PAlindrome " + isPalindrome(n)
        );

        bufferedReader.close();
        bufferedWriter.close();
    }



    private static boolean isPalindrome(int x) {

        if(x==-1)
            return false;

        int n=x,z,sum=0,i=1,j=0;
        var k = new int[10];
        do{
            z=n%10;
            k[j++]=z;
            n=n/10;
            i=n>0?(i*10):i;
        }while(n>0);

        n=x; sum=0;
        for (int p = 0;p < j;p++) {
            sum = sum+ (k[p]*i);
            i=i/10;
        }
        if(sum==x)
            return true;
        else
            return false;


    }


    public NumberPalindrome() throws IOException {
    }
}
