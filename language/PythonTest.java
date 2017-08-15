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
	public void ClassGivenReturnVariableStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("variable")));
	}
	
	@Test
	public void TesterGivenReturnVariableStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType("return variable"));
	}
	
	@Test
	public void ClassGivenReturnIntStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("5")));
	}
	
	@Test
	public void TesterGivenReturnIntStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType("return 5"));
	}
	
	@Test
	public void ClassGivenReturnFloatStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("5.0f")));
	}
	
	@Test
	public void TesterGivenReturnFloatStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType("return 5.0f"));
	}
	
	@Test
	public void ClassGivenReturnStringStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType(Python.returnStatement("\"result\"")));
	}
	
	@Test
	public void TesterGivenReturnStringStatementTest()
	{
		assertEquals("RETURN", Python.determineStatementType("return \"result\""));
	}
}
