package com.sting;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SalesbyMatch {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int sockMerchant(int n, @NotNull List<Integer> ar) {

        Map<Integer, Integer> colours = new HashMap<>();
        for (Integer colour : ar) {
            Integer count = colours.get(colour);
            if (count != null)
                colours.put(colour, ++count);
            else
                colours.put(colour, 1);
        }

        //classic java coding
        /*int pairs = 0;
        for (Integer pair :colours.values())
            pairs += pairs+2 */

        //Foreach lambda with atomic integer
        /*AtomicInteger pairs = new AtomicInteger();
        Hashmap foreach usage with atomic integer
        colours.forEach((k,v)-> pairs.addAndGet(v / 2));*/

        return colours.values().stream().reduce(0, (a, b) -> a + b / 2);
    }

}
