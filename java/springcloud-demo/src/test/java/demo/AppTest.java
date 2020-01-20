package demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest  extends A
{
    
    @Test
    public void test1()
    {
        assertTrue( true );
    }
    
    @Test
    public void test2()
    {
        assertTrue( true );
    }
    @Test
    public void test3()
    {
        throw new RuntimeException();
    }
}
