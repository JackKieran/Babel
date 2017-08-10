package language;

public class Python extends Language 
{
	private static final String RETURN = "return [a-zA-Z0-9\\W\\s]*[^;]";
	private static final String ASSIGNMENT = "[a-zA-Z0-9]+ [\\W]?= [\\W]?[a-zA-Z0-9]+[\\W]?[^;]";
	
	public static String getExtension()
	{
		return ".py";
	}

	public static String getLanguage() 
	{
		return "Python";
	}
	
	
	public static String determineStatementType(String statement)
	{
		String result = null;
		
		if(statement.matches(RETURN))
			return "RETURN";
		
		else if(statement.matches(ASSIGNMENT))
			return "ASSIGNMENT";
		
		return result;
	}
	
	public static String returnStatement(String parameter)
	{
		return "return " + parameter;
	}
	
	public static String assignmentStatement(String variable, String value)
	{
		return variable + " = " + value;
	}
}
