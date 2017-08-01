package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class language_Unit_Tests {

	@Test
	public void javaTest() 
	{
		assertEquals(Java.getLanguage(), "Java");
		assertEquals(Java.getExtension(), ".java");
	}

	@Test
	public void pythonTest()
	{
		assertEquals(Python.getLanguage(), "Python");
		assertEquals(Python.getExtension(), ".py");
	}
	
}
