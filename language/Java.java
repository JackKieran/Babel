package language;

public class Java extends Language 
{
	private static final String RETURN = "return [\"]*[a-zA-Z0-9\\s\\W]*[\"]*;";
	private static final String ASSIGNMENT = "[a-zA-Z0-9\\s]+ [\\W]?= [\\W]?[a-zA-Z0-9\\s\\W]+[\\W]?;";
	private static final String OPENING = "(public|private|protected)?[\\s]?class [a-zA-Z0-9\\s\\W]* \\{";
	private static final String PRINT = "System.out.print(ln)?\\([a-zA-Z0-9\\s\\W]*\\);";
	
	@Override
	public String getExtension() 
	{
		return ".java";
	}

	public String getLanguage() 
	{
		return "Java";
	}

	public String determineStatementType(String statement)
	{
		String result = null;
		
		if(statement.matches(RETURN))
			result = "RETURN";
		
		else if(statement.matches(ASSIGNMENT))
			result = "ASSIGNMENT";
		
		else if(statement.matches(OPENING))
			result = "OPENING";
		
		else if(statement.matches(PRINT))
			result = "PRINT";
		
		return result;
	}
	
	public String returnStatement(String parameter) 
	{
		return "return " + parameter + ";";
	}

	public String assignmentStatement(String variable, String value)
	{
		return variable + " = " + value + ";";
	}
	
	public String openingStatement(String className, String visability)
	{
		return (visability + " class " + className + " {").trim();
	}
	
	public String printStatement(String content)
	{
		return "System.out.println(\"" + content + "\");";
	}
}
