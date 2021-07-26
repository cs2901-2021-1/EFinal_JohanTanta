package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

class DemoTester {
    static final Logger logger = Logger.getLogger(DemoTester.class.getName());
    @Test
    void test() throws IOException {
        logger.info("Test");
        Assert.assertTrue(true);
    }
};