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
	public void ClassGivenStringAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType(Java.assignmentStatement("hello", "hello")));
	}
	
	@Test
	public void TesterGivenStringAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType("hello = \"hello\";"));
	}
	
	@Test
	public void ClassGivenStringAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType(Java.assignmentStatement("String hello", "hello there")));
	}
	
	@Test
	public void TesterGivenStringAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType("String hello = \"hello there\";"));
	}
	
	@Test
	public void ClassGivenFloatAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType(Java.assignmentStatement("variable", "5.0f")));
	}
	
	@Test
	public void TesterGivenFloatAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType("variable = 5.0f;"));
	}
	
	@Test
	public void ClassGivenFloatAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType(Java.assignmentStatement("float variable", "5.0f")));
	}
	
	@Test
	public void TesterGivenFloatAssignmentSpecifiedTypeSatement()
	{
		assertEquals("ASSIGNMENT", Java.determineStatementType("float variable = 5.0f;"));
	}
	
	
	
	@Test
	public void OpeningStatement()
	{
		String statement = Java.openingStatement("ClassName", "public");
		System.out.println(statement);
		assertEquals("OPENING", Java.determineStatementType(statement));
	}
}
