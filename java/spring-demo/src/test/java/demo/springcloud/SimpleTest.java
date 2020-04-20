package demo.springcloud;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

 
@RunWith(SpringRunner.class)
@SpringBootTest
@Profile("test")
@SpringBootConfiguration
public class SimpleTest {
    @Test
    public void doTest() {
        int num = new Integer(1);
        Assert.assertEquals(num, 1);
        
        String s="org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)";
        System.out.println(s.getBytes().length);
    }
}