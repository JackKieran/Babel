package language;

public class Python extends Language 
{
	public static String getExtension()
	{
		return ".py";
	}

	public static String getLanguage() 
	{
		return "Python";
	}
	
	public static String returnStatement(String parameter)
	{
		return "return " + parameter;
	}
	
	public static String determineStatementType(String statement)
	{
		String result = null;
		
		System.out.println(statement);
		
		if(statement.matches("return [a-zA-Z0-9\\W\\s]*[^;]"))
			return "RETURN";
		
		return result;
	}
}
