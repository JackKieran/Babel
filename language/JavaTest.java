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
	public void ClassGivenPublicClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType(Java.openingStatement("ClassName", "public")));
	}
	
	@Test
	public void TesterGivenPublicClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType("public class ClassName {"));
	}
	
	@Test
	public void ClassGivenPrivateClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType(Java.openingStatement("ClassName", "private")));
	}
	
	@Test
	public void TesterGivenPrivateClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType("private class ClassName {"));
	}
	
	@Test
	public void ClassGivenProtectedClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType(Java.openingStatement("ClassName", "protected")));
	}
	
	@Test
	public void TesterGivenProtectedClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType("protected class ClassName {"));
	}
	
	@Test
	public void ClassGivenDefaultClassOpeningStatement()
	{
		System.out.println(Java.openingStatement("ClassName", ""));
		assertEquals("OPENING", Java.determineStatementType(Java.openingStatement("ClassName", "")));
	}
	
	@Test
	public void TesterGivenDefaultClassOpeningStatement()
	{
		assertEquals("OPENING", Java.determineStatementType("class ClassName {"));
	}
}
