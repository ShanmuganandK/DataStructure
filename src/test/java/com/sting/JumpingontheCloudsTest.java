package com.sting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JumpingontheCloudsTest {

    @Tag("DEV")
    @Test
    void count()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 ,JumpingontheClouds.jumpingOnClouds(List.of(0, 0, 1, 0, 0,1,0)));
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 3 ,JumpingontheClouds.jumpingOnClouds(List.of(0, 0, 0, 0, 0,1)));
        System.out.println("======TEST THREE EXECUTED=======");
        Assertions.assertEquals( 4 ,JumpingontheClouds.jumpingOnClouds(List.of(0, 0, 1, 0, 0,1,0)));
    }
}
