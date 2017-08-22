package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class PythonTest 
{
	public Python python = new Python();
	
	@Test
	public void NullStatementTest() 
	{
		assertEquals(null, python.determineStatementType(""));
	}
	
	@Test
	public void ClassGivenReturnVariableStatement()
	{
		assertEquals("RETURN", python.determineStatementType(python.returnStatement("variable")));
	}
	
	@Test
	public void TesterGivenReturnVariableStatement()
	{
		assertEquals("RETURN", python.determineStatementType("return variable"));
	}
	
	@Test
	public void ClassGivenReturnIntStatement()
	{
		assertEquals("RETURN", python.determineStatementType(python.returnStatement("5")));
	}
	
	@Test
	public void TesterGivenReturnIntStatement()
	{
		assertEquals("RETURN", python.determineStatementType("return 5"));
	}
	
	@Test
	public void ClassGivenReturnFloatStatement()
	{
		assertEquals("RETURN", python.determineStatementType(python.returnStatement("5.0f")));
	}
	
	@Test
	public void TesterGivenReturnFloatStatement()
	{
		assertEquals("RETURN", python.determineStatementType("return 5.0f"));
	}
	
	@Test
	public void ClassGivenReturnStringStatement()
	{
		assertEquals("RETURN", python.determineStatementType(python.returnStatement("\"result\"")));
	}
	
	@Test
	public void TesterGivenReturnStringStatement()
	{
		assertEquals("RETURN", python.determineStatementType("return \"result\""));
	}
	
	
	@Test
	public void ClassGivenPrintStatement()
	{
		assertEquals("PRINT", python.determineStatementType(python.printStatement("\"Hello World!\"")));
	}
}
