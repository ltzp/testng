package multcases;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"letao"})
public class MultCase {

    public void caseOne(){
        System.out.println("111111");
        Assert.assertTrue(false);
    }

    public void caseTwo(){
        System.out.println("22222");
        Assert.assertEquals("2","2");
    }
}
