package package1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class3 {

	@Test
	public void p1c3m1() {
		System.out.println("Package1 class3 method1");
	}
	
	@Test
	public void p1c3m2() {
		System.out.println("Package1 class3 method2");
	}
	
	@Test
	public void p1c3m3() {
		System.out.println("Package1 class3 method3");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("I will get executed before package1 class3 method1 because i am defined in class3 of package1");
	}
	
}
