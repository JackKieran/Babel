package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class language_Unit_Tests {

	@Test
	public void javaTest() 
	{
		Language java = new Java();
		
		assertEquals(java.getLanguage(), "Java");
		assertEquals(java.getExtension(), ".java");
	}

}
