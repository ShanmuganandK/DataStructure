package com.sting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class CountingValleysTest {
    @Tag("DEV")
    @Test
    void count()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 1 ,CountingValleys.countingValleys(8,"DDDDUUUU"));
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 2 ,CountingValleys.countingValleys(8,"DDUUDDUU"));
        System.out.println("======TEST THREE EXECUTED=======");
        Assertions.assertEquals( 0 ,CountingValleys.countingValleys(8,"UUDDUUDD"));
    }
}

