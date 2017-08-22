package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaTest 
{
	
	public Java java = new Java();
	
	@Test
	public void nullStatementTest()
	{
		assertEquals(null, java.determineStatementType(""));
	}
	
	@Test
	public void ClassGivenReturnIntStatementTest()
	{
		assertEquals("RETURN", java.determineStatementType(java.returnStatement("5")));
	}
	
	@Test
	public void TesterGivenReturnIntStatementTest()
	{
		assertEquals("RETURN", java.determineStatementType("return 5;"));
	}
	
	@Test
	public void ClassGivenReturnFloatStatementTest()
	{
		assertEquals("RETURN", java.determineStatementType(java.returnStatement("5.0f")));
	}
	
	@Test
	public void TesterGivenReturnFloatStatementTest()
	{
		assertEquals("RETURN", java.determineStatementType("return 5.0f;"));
	}
	
	@Test
	public void TesterGivenReturnStringStatementTest()
	{
		assertEquals("RETURN", java.determineStatementType("return \"result\";"));
	}
	
	@Test
	public void ClassGivenReturnStringStatementTest()
	{
		assertEquals("RETURN", java.determineStatementType(java.returnStatement("\"result\"")));
	}
	
	@Test
	public void ClassGivenStringAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType(java.assignmentStatement("hello", "hello")));
	}
	
	@Test
	public void TesterGivenStringAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType("hello = \"hello\";"));
	}
	
	@Test
	public void ClassGivenStringAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType(java.assignmentStatement("String hello", "hello there")));
	}
	
	@Test
	public void TesterGivenStringAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType("String hello = \"hello there\";"));
	}
	
	@Test
	public void ClassGivenFloatAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType(java.assignmentStatement("variable", "5.0f")));
	}
	
	@Test
	public void TesterGivenFloatAssignmentNonSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType("variable = 5.0f;"));
	}
	
	@Test
	public void ClassGivenFloatAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType(java.assignmentStatement("float variable", "5.0f")));
	}
	
	@Test
	public void TesterGivenFloatAssignmentSpecifiedTypeSatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType("float variable = 5.0f;"));
	}
	
	@Test
	public void ClassGivenCharAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType(java.assignmentStatement("char variable", "a")));
	}
	
	@Test
	public void TesterGivenCharAssignmentSpecifiedTypeStatement()
	{
		assertEquals("ASSIGNMENT", java.determineStatementType("char variable = 'a';"));
	}
	
	@Test
	public void ClassGivenPublicClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType(java.openingStatement("ClassName", "public")));
	}
	
	@Test
	public void TesterGivenPublicClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType("public class ClassName {"));
	}
	
	@Test
	public void ClassGivenPrivateClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType(java.openingStatement("ClassName", "private")));
	}
	
	@Test
	public void TesterGivenPrivateClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType("private class ClassName {"));
	}
	
	@Test
	public void ClassGivenProtectedClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType(java.openingStatement("ClassName", "protected")));
	}
	
	@Test
	public void TesterGivenProtectedClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType("protected class ClassName {"));
	}
	
	@Test
	public void ClassGivenDefaultClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType(java.openingStatement("ClassName", "")));
	}
	
	@Test
	public void TesterGivenDefaultClassOpeningStatement()
	{
		assertEquals("OPENING", java.determineStatementType("class ClassName {"));
	}
	
	@Test
	public void ClassGivenPrintStatement()
	{
		assertEquals("PRINT", java.determineStatementType(java.printStatement("Hello World!")));
	}
	
	@Test
	public void getLanguage()
	{
		assertEquals(true, java.getLanguage().equals("Java"));
	}
}
