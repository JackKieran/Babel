package language;

public class Python extends Language 
{
	private static final String RETURN = "return [a-zA-Z0-9\\W\\s]*[^;]";
	private static final String ASSIGNMENT = "[a-zA-Z0-9]+ [\\W]?= [\\W]?[a-zA-Z0-9]+[\\W]?[^;]";
	private static final String PRINT = "print[\\s]?\\([a-zA-Z0-9\\s\\W]*\\)";
	
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
			result = "RETURN";
		
		else if(statement.matches(ASSIGNMENT))
			result = "ASSIGNMENT";
		
		else if(statement.matches(PRINT))
			result = "PRINT";
		
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
	
	public static String printStatement(String content)
	{
		return "print (" + content + ")";
	}
}
