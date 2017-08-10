package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class language_Unit_Tests 
{

	@Test
	public void javaTest() 
	{
		assertTrue(Language.class.isAssignableFrom(Java.class));
		
		assertEquals(Java.getLanguage(), "Java");
		assertEquals(Java.getExtension(), ".java");
		
		assertEquals(Java.returnStatement("5"), "return 5;");
		assertEquals(Java.determineStatementType(Java.returnStatement("5")), "RETURN");
		
		assertEquals(Java.returnStatement("\"Hello World!\""), "return \"Hello World!\";");
		assertEquals(Java.determineStatementType(Java.returnStatement("\"Hello World!\"")), "RETURN");
	}

	@Test
	public void pythonTest()
	{
		assertTrue(Language.class.isAssignableFrom(Python.class));
	
		assertEquals(Python.getLanguage(), "Python");
		assertEquals(Python.getExtension(), ".py");
	}
	
}
