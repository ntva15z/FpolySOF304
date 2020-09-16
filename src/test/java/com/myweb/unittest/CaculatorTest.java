package com.myweb.unittest;

import org.junit.Assert;
import org.junit.Test;

public class CaculatorTest {
    @Test
    public void sumTest(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(5,caculator.sum(2,3));
    }

    @Test
    public void subtractTest(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(2,caculator.subtract(5,3));
    }

    @Test
    public void mutipleTest(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(6,caculator.mutiple(2,3));
    }

    @Test
    public void divideTestBvalueZero() throws Exception {
        Caculator caculator = new Caculator();
        Assert.assertEquals("wrong",caculator.divide(8,0));
    }
    @Test
    public void divideTest() throws Exception {
        Caculator caculator = new Caculator();
        Assert.assertEquals(2.6,caculator.divide(8,3),1f);
    }
}
