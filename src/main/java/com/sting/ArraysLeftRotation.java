package com.sting;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class ArraysLeftRotation {

    static List<Integer> rotLeft(List<Integer> arrayToRotate, int numberOfRotations) {


       if(arrayToRotate.size()!=numberOfRotations){
           rotate(arrayToRotate,arrayToRotate.get(numberOfRotations),numberOfRotations,arrayToRotate.size());
       }

        return arrayToRotate;

    }

    private static void  rotate(List<Integer> arrayToRotate, Integer valueToRotate, Integer indexToRotate, Integer size){

        //if(indexToRotate<arrayToRotate.size())
            //rotate(arrayToRotate, arrayToRotate.set(indexToRotate,valueToRotate),++indexToRotate);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result  = rotLeft(a, d);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
