package language;

public class Python extends Language 
{
	private  final String RETURN = "return [a-zA-Z0-9\\W\\s]*[^;]";
	private  final String ASSIGNMENT = "[a-zA-Z0-9]+ [\\W]?= [\\W]?[a-zA-Z0-9]+[\\W]?[^;]";
	private  final String PRINT = "print[\\s]?\\([a-zA-Z0-9\\s\\W]*\\)";
	
	@Override
	public String getExtension()
	{
		return ".py";
	}

	@Override
	public String getLanguage() 
	{
		return "Python";
	}
	
	
	public String determineStatementType(String statement)
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
	
	public String returnStatement(String parameter)
	{
		return "return " + parameter;
	}
	
	public String assignmentStatement(String variable, String value)
	{
		return variable + " = " + value;
	}
	
	public String printStatement(String content)
	{
		return "print (" + content + ")";
	}
}
