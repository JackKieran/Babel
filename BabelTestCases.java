package Babel;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabelTestCases 
{
	//Unit Test for the Python class
	@Test
	public void PythonClassTest() 
	{
		Python py = new Python();
		assertEquals(py.getExtension(), ".py");
		
		assertEquals(py.getLanguage(), "Python", );
	}

}
