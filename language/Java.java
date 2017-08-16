package language;

public class Java extends Language 
{
	private static final String RETURN = "return [\"]*[a-zA-Z0-9\\s\\W]*[\"]*;";
	private static final String ASSIGNMENT = "[a-zA-Z0-9\\s]+ [\\W]?= [\\W]?[a-zA-Z0-9\\s\\W]+[\\W]?;";
	private static final String OPENING = "(public|private|protected) class [a-zA-Z0-9\\s\\W]* \\{";
	
	public static String getExtension() 
	{
		return ".java";
	}

	public static String getLanguage() 
	{
		return "Java";
	}

	public static String determineStatementType(String statement)
	{
		String result = null;
		
		if(statement.matches(RETURN))
			result = "RETURN";
		
		if(statement.matches(ASSIGNMENT))
			result = "ASSIGNMENT";
		
		if(statement.matches(OPENING))
			result = "OPENING";
		
		return result;
	}
	
	public static String returnStatement(String parameter) 
	{
		return "return " + parameter + ";";
	}

	public static String assignmentStatement(String variable, String value)
	{
		return variable + " = " + value + ";";
	}
	
	public static String openingStatement(String className, String visability)
	{
		return visability + " class " + className + " {";
	}
}
