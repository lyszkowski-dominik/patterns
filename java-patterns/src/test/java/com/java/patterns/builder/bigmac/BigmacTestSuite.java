package com.java.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew(){
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .roll("Sesam")
                .burgers(3)
                .sauce("Spicy")
                .ingredient("Salad")
                .ingredient("Mushroom")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);
        Assert.assertEquals("Sesam",bigmac.getRoll());
    }
}
