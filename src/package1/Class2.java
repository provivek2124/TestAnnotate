package package1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	public void p1c2m1() {
		System.out.println("Package1 class2 method1");
	}
	
	@Test
	public void p1c2m2() {
		System.out.println("Package1 class2 method2");
	}
	
	@Test
	public void p1c2m3() {
		System.out.println("Package1 class2 method3");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("I will get executed before package1 class2 method1 because i am defined in class2 of package1");
	}
}
