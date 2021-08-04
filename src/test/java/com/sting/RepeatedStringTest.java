package com.sting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.sting.RepeatedString.repeatedString;

public class RepeatedStringTest {

    @Tag("DEV")
    @Test
    void repeatCount()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , repeatedString("abcac",10));
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 7 , repeatedString("aba",10));
        System.out.println("======TEST THREE EXECUTED=======");
        Assertions.assertEquals( 1000000000000L , repeatedString("a",1000000000000L));
    }
}
