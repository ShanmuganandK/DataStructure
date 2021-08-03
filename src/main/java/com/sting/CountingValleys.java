package com.sting;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingValleys {

    /* Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        AtomicInteger level = new AtomicInteger();
        AtomicInteger valley = new AtomicInteger();

        return path.chars().reduce(0,(a,b)->{
            if (b == 68) {
                if (level.get() == 0)
                    valley.getAndIncrement();
                 level.getAndDecrement();
            } else
                 level.getAndIncrement();
            return valley.get();
        });

        //Classic code
        /*for (char c : path.toCharArray()) {
            if (c == 'D') {
                if (level.get() == 0)
                    valley.getAndIncrement();
                level.getAndDecrement();
            } else
                level.getAndIncrement();
        }

        return valley.get();*/

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
