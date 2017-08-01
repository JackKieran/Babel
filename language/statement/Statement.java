package language.statement;

public class Statement 
{
	private String text;
	private String type;

	public Statement(String text)
	{
		this.text = text;
		this.type = evalutateType(text);
	}
	
	private String evaluateType()
	{
		String result = null;
		
		if(itIsAReturnStatement())
			result = "Return";
		
		else if(itIsAnAssignmentStatement())
			result = "Assignment";
		
		else if(itIsACallStatement())
			result = "Call";
		
		else if(itIsABasicForLoop())
			result = "Basic For Loop";
		
		else if(itIsAnEnhancedForLoop())
			result = "Enhanced For Loop";
		
		
		
		return result;
	}
	
	private boolean itIsAReturnStatement()
	{
		return this.text.trim().startsWith("return ");
	}
	
	private boolean itIsAnAssignmentStatement()
	{
		return this.text.trim().matches("([A-Za-z0-9]+)[\s]+=([])");
	}
	
	
	public String getType()
	{
		return this.type;
	}
}
