package language;

public class Java extends Language 
{
	private static final String RETURN = "return [\"]*[a-zA-Z0-9\\s\\W]*[\"]*;";

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
		
		return result;
	}
	
	public static String returnStatement(String parameter) 
	{
		return "return " + parameter + ";";
	}

}
