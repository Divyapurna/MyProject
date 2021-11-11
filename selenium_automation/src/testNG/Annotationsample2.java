package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotationsample2 {
//  @Test K-4
//  @TestZ-5
//  @Before class-1
//  @After class-6  
//  @Test abc-3
//  @Test a -2



  @Test//actual test case
  public void k() {
	  System.out.println("Actual test case k");
  }
  @Test//actual test case
  public void z() {
	  System.out.println("Actual test case z");
  }
  @BeforeClass//precondition
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass//post condition
  public void afterClass() {
	  System.out.println("After class");
  }
	  @Test//actual test case
	  public void abc() {
		  System.out.println("Actual test case abc");
	  } 
	  @Test//actual test case
	  public void a() {
		  System.out.println("Actual test case a");
	  }

  }


