package translator;

import java.io.File;
import java.io.IOException;

import language.Language;

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
	
	public ProgramFile [] getTranslatingFiles(File fileToTranslate, String languageToTranslateTo) throws FileIsTheSameLanguageException, IOException, FileIsNotAProgramException, NotAValidLanguageException
	{
		ProgramFile [] result = new ProgramFile [2];
		
		try
		{
			result[0] = new ProgramFile(fileToTranslate);
		}
		catch(IOException io)
		{
			throw io;
		}
		Language before = result[0].getLanguage();
		
		if(before == null)
			throw new FileIsNotAProgramException(fileToTranslate);
		
		if(sameLanguage(before, languageToTranslateTo))
			throw new FileIsTheSameLanguageException(fileToTranslate, languageToTranslateTo);
		
		Language after = Language.getLanguageFromName(languageToTranslateTo);
		
		if(after == null)
			throw new NotAValidLanguageException(languageToTranslateTo);
		
		String newFileName = result[0].getFile().getName();
		newFileName = newFileName.substring(0, newFileName.lastIndexOf('.'));
		String newExtension = after.getExtension();
		String newFilepath = result[0].getFile().getParent() + newFileName + newExtension;
			
		try
		{
			result[1] = new ProgramFile(new File(newFilepath));
		}
		catch(IOException io)
		{
			throw io;
		}
		
		return result;
	}
	
	private boolean sameLanguage(Language before, String after)
	{
		return before.getLanguage().equals(after);
	}
}

class FileIsTheSameLanguageException extends Exception
{
	private File fileToTranslate;
	private String languageToTranslateTo;
	
	public FileIsTheSameLanguageException(File fileToTranslate, String languageToTranslateTo)
	{
		this.fileToTranslate = fileToTranslate;
		this.languageToTranslateTo = languageToTranslateTo;
	}
	
	@Override
	public String getMessage()
	{
		return "The file: " + fileToTranslate.getName() + " is already a " + languageToTranslateTo + " file";
	}
}

class FileIsNotAProgramException extends Exception
{
	private File fileToTranslate;
	
	public FileIsNotAProgramException(File fileToTranslate)
	{
		this.fileToTranslate = fileToTranslate;
	}
	
	@Override
	public String getMessage()
	{
		return "The file: " + fileToTranslate.getName() + " is not a translateable program";
	}
}

class NotAValidLanguageException extends Exception
{
	private String language;
	
	public NotAValidLanguageException(String language)
	{
		this.language = language;
	}
	
	@Override
	public String getMessage()
	{
		return "The language: " + language + " is not a valid/translatable language";
	}
}
