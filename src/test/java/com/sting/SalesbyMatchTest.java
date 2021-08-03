package com.sting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;


public class SalesbyMatchTest {

    @Tag("DEV")
    @Test
    void pair()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 1 , SalesbyMatch.sockMerchant(4,
            List.of(1,
                    2,
                    3,1)));
    }

}
