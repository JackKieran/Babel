package translator;

import java.io.File;

import language.*;

public class ProgramFile 
{
	private File file;
	private Language language;
	
	public ProgramFile(File file)
	{
		this.file = file;
		
		String filename = file.getName();
		String extension = filename.substring(filename.lastIndexOf('.'));
		
		this.language = Language.getLanguageFromExtension(extension);
	}
	
	public Language getLanguage()
	{
		return this.language;
	}

	public File getFile()
	{
		return this.file;
	}
}
