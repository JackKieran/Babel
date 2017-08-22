package translator;

import java.io.File;

public class ProgramFileManager 
{
	private static ProgramFileManager instance = null;
	
	private ProgramFileManager(){}
	
	public static ProgramFileManager getInstance()
	{
		if(instance == null)
			return new ProgramFileManager();
		
		return instance;
	}
	
	public ProgramFile [] getTranslatingFiles(File fileToTranslate, String languageToTranslateTo)
	{
		ProgramFile [] result = new ProgramFile [2];
		
		
		
		return result;
	}
}

class FileIsTheSameLanguageException extends Exception
{
	private File fileToTranslate;
	private String languageToTranslateTo;
	
	@Override
	public String getMessage()
	{
		return "The file: " + fileToTranslate.getName() + " is already a " + languageToTranslateTo + " file";
	}
}
