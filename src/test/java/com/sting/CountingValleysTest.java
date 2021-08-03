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
    }
}

