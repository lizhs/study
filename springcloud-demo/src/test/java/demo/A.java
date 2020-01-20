package demo;

public class A {
	/**
     * Rigorous Test :-)
     */
	@org.junit.Before
	public void before() {
		System.out.println("before");
	}
	@org.junit.After
	public void after() {
		System.out.println("after");
	}
}
