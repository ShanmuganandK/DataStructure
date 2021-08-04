package com.sting;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class JumpingontheClouds {

    public static int jumpingOnClouds(List<Integer> c) {


        int jump =0;
        int size = c.size();
        int index;

        if(size==2)
            return 1;

        for(index = 2;index <c.size();index++) {
            jump++;
            index = c.get(index)==1?index:((index+2)<size?++index:index);
        }

        return index==size?jump:++jump;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
