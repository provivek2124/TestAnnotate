package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

		@Test
		public void p1c1m1() {
			System.out.println("Package1 class1 method1");
		}
		
		@Test
		public void p1c1m2() {
			System.out.println("Package1 class1 method2");
		}
		
		@Test
		public void p1c1m3() {
			System.out.println("Package1 class1 method3");
		}
		
		// BeforeSuite Annotation
		@BeforeSuite
		public void bs() {
			System.out.println("I will get executed first");
		}
		
		//BeforeTest Annotation
		@BeforeTest
		public void bt() {
			System.out.println("This will get executed second");
		}
		
		@BeforeClass 
		public void bc(){
			System.out.println("This will get executed third");
		}
		
		@AfterClass
		public void ac() {
			System.out.println("This will get executed after package1 class1 method3");
		}
		
		@AfterTest
		public void at() {
			System.out.println("This will get executed after package1 class3 method3");
		}
		
		@AfterSuite
		public void as() {
			System.out.println("This will get executed last");
		}
}
