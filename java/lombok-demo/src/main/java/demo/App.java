package demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LombokTest  test=new  LombokTest();
        test.setName("xxx");
		System.out.printf(test.getName());
     }
}
