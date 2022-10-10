package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {

    @Test
    public void testCase(){
        System.out.println("hello testng");
        Assert.assertEquals(1,1);
    }
}
