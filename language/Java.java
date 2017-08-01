package language;

import language.statement.*;

public class Java extends Language 
{

	public static String getExtension() 
	{
		return ".java";
	}

	public static String getLanguage() 
	{
		return "Java";
	}

	public static Statement returnStatement() 
	{
		return new ReturnStatement(5);
	}

}
