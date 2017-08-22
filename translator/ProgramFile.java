package translator;

import java.io.File;

import language.*;

public class ProgramFile 
{
	private Language language;
	
	public ProgramFile(File file)
	{
		String filename = file.getName();
		String extension = filename.substring(filename.lastIndexOf('.'));
		
		language = Language.getLanguageFromExtension(extension);
	}
	
	public Language getLanguage()
	{
		return this.language;
	}

}
