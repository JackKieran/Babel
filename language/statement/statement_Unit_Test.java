package language.statement;

import static org.junit.Assert.*;

import org.junit.Test;

import language.*;

public class statement_Unit_Test 
{

	@Test
	public void statementTest() 
	{
		Statement statement = new Statement("Return");
		
		assertEquals(statement.getType(), "Return");
	}

}
