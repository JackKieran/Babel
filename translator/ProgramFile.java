package translator;

import java.io.File;

import language.*;

public class ProgramFile 
{

	File file;
	Language language;
	
	private ProgramFile(String filepath) 
	{
		file = new File(filepath);
		language = getFileLanguage(filepath);
	}

	private Language getFileLanguage(String filepath)
	{
		if(filepath.endsWith(".java"))
			return new Java();
		
		if(filepath.endsWith(".py"))
			return new Python();
		
		
		else
			return null;
	}
	
	public static ProgramFile newFile(String filepath)
	{
		if(validProgramFilepath(filepath))
			return new ProgramFile(filepath);
		
		return null;
	}
	
	private static boolean validProgramFilepath(String filepath)
	{
		return true;
	}
	
}
