package com.myweb.unittest;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {
    @Test
    public void isSumnumberTrue(){
        Number number = new Number(4);
        Assert.assertEquals(true,number.isEvenNumber());
        Assert.assertEquals(true,number.isEvenNumber(8));
        Assert.assertEquals(false,number.isEvenNumber(5));
    }
}
