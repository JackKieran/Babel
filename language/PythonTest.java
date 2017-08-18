package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class PythonTest 
{
	@Test
	public void NullStatementTest() 
	{
		assertEquals(null, Python.determineStatementType(""));
	}
	
	@Test
	public void ClassGivenReturnVariableStatement()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("variable")));
	}
	
	@Test
	public void TesterGivenReturnVariableStatement()
	{
		assertEquals("RETURN", Python.determineStatementType("return variable"));
	}
	
	@Test
	public void ClassGivenReturnIntStatement()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("5")));
	}
	
	@Test
	public void TesterGivenReturnIntStatement()
	{
		assertEquals("RETURN", Python.determineStatementType("return 5"));
	}
	
	@Test
	public void ClassGivenReturnFloatStatement()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("5.0f")));
	}
	
	@Test
	public void TesterGivenReturnFloatStatement()
	{
		assertEquals("RETURN", Python.determineStatementType("return 5.0f"));
	}
	
	@Test
	public void ClassGivenReturnStringStatement()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("\"result\"")));
	}
	
	@Test
	public void TesterGivenReturnStringStatement()
	{
		assertEquals("RETURN", Python.determineStatementType("return \"result\""));
	}
	
	
	@Test
	public void ClassGivenPrintStatement()
	{
		assertEquals("PRINT", Python.determineStatementType(Python.printStatement("\"Hello World!\"")));
	}
}
