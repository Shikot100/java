package test;

import org.testng.annotations.Test;

import base.Testbase;

public class DesheCartTest extends Testbase{
  @Test
	public void ourFirstTest() throws Exception{
		getDriver().getLogin("nahidbabu6@gmail.com", "nahid1234");
		
	}
}
