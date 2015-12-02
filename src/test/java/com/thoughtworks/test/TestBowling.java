package com.thoughtworks.test;

import com.thoughtworks.BowlingCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yongliuli on 15/12/2.
 */
public class TestBowling {

    @Test
    public void test_caculate_with_array() {

        int[] input1 = new int[]{1, 2, 3, 4};
        int[] input2 = new int[]{9, 1, 9, 1};
        int[] input3 = new int[]{
                10, 10, 10, 10,
                10, 10, 10, 10,
                10, 10, 10, 10};
        BowlingCalculator bowling = new BowlingCalculator();

        Assert.assertEquals(10, bowling.bowlingScore(input1));
        Assert.assertEquals(29, bowling.bowlingScore(input2));
        Assert.assertEquals(300, bowling.bowlingScore(input3));


    }

    @Test
    public void test_caculate_with_string() {

        String input1 = "1 2 3 4";
        String input2 = "9 1 9 1";
        String input3 = "10 10 10 10 10 10 " +
                "10 10 10 10 10 10";
        BowlingCalculator bowling = new BowlingCalculator();

        Assert.assertEquals(10, bowling.bowlingScore(input1));
        Assert.assertEquals(29, bowling.bowlingScore(input2));
        Assert.assertEquals(300, bowling.bowlingScore(input3));

    }


}
