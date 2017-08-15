package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaTest 
{
	@Test
	public void nullStatementTest()
	{
		assertEquals(null, Java.determineStatementType(""));
	}
	
	@Test
	public void ClassGivenReturnIntStatementTest()
	{
		assertEquals("RETURN", Java.determineStatementType(Java.returnStatement("5")));
	}
	
	@Test
	public void TesterGivenReturnIntStatementTest()
	{
		assertEquals("RETURN", Java.determineStatementType("return 5;"));
	}
	
	@Test
	public void ClassGivenReturnFloatStatementTest()
	{
		assertEquals("RETURN", Java.determineStatementType(Java.returnStatement("5.0f")));
	}
	
	@Test
	public void TesterGivenReturnFloatStatementTest()
	{
		assertEquals("RETURN", Java.determineStatementType("return 5.0f;"));
	}
	
	@Test
	public void TesterGivenReturnStringStatementTest()
	{
		assertEquals("RETURN", Java.determineStatementType("return \"result\";"));
	}
	
	@Test
	public void ClassGivenReturnStringStatementTest()
	{
		assertEquals("RETURN", Java.determineStatementType(Java.returnStatement("\"result\"")));
	}
	
	@Test
	public void ClassGivenAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType(Java.assignmentStatement("hello", "hello")));
	}
	
	@Test
	public void TesterGivenAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType("hello = \"hello\";"));
	}
	
	@Test
	public void ClassGivenAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType(Java.assignmentStatement("String hello", "hello")));
	}
	
	@Test
	public void TesterGivenAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType("String hello = \"hello\";"));
	}
}
