package com.sting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArrayLeftRotationTest {
    @Tag("DEV")
    @Test
    void rotate() {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals(List.of(5,1,2,3,4),ArraysLeftRotation.rotLeft(List.of(1, 2, 3, 4, 5),4));
    }


}
