package translator;

import java.io.File;

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
	
	public ProgramFile [] getTranslatingFiles(File fileToTranslate, String languageToTranslateTo) throws FileIsTheSameLanguageException
	{
		ProgramFile [] result = new ProgramFile [2];
		
		result[0] = new ProgramFile(fileToTranslate);
		Language before = result[0].getLanguage();
		
		if(sameLanguage(before, languageToTranslateTo))
			throw new FileIsTheSameLanguageException(fileToTranslate, languageToTranslateTo);
		
		Language after = Language.getLanguageFromName(languageToTranslateTo);
		
		String newFileName = result[0].getFile().getName();
		newFileName = newFileName.substring(0, newFileName.lastIndexOf('.'));
		String newExtension = after.getExtension();
		String newFilepath = result[0].getFile().getParent() + newFileName;
			
		result[1] = new ProgramFile(new File(newFilepath));
		
		return result;
	}
	
	public boolean sameLanguage(Language before, String after)
	{
		System.out.println(before.getLanguage());
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
