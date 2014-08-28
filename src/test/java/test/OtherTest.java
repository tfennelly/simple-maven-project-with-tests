package test;

import org.junit.Assert;
import org.junit.Test;

public class OtherTest {

    @Test
    public void mytest() {
        // Fail every one in five (or so)
//        if (System.currentTimeMillis() % 5 == 0) {
//            Assert.fail("Failed");
//        }
        if (System.currentTimeMillis() % 5 == 0) {
            Manzer.main(new String[] {"hi"});
        }
    }

}
