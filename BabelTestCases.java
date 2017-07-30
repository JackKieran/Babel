package BabelMainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabelTestCases {

	@Test
	public void PythonClassTest() 
	{
		Python py = new Python();
		assertEquals(".py", py.getExtension());
		
		assertEquals("Python", py.getLanguage());
	}

}
