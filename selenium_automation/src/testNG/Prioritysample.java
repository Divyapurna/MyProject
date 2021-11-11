package testNG;

import org.testng.annotations.Test;

public class Prioritysample {
  
  @Test(priority=1)
	  public void abc() {
		  System.out.println("system print @test abc");  
  }
			
  @Test (priority=5)
	  public void h() {
		  System.out.println("system print @test h");  
	  }
		@Test(priority=4)
	  public void b() {
		  System.out.println("system print @test b");  
	  }
		@Test(priority=2)
	  public void c() {
		  System.out.println("system print @test c");  
	  }
		@Test
	  public void e() {
		  System.out.println("system print @test e");  
	  }
	  
  }

