package translator;

import java.io.File;

public class Translator 
{	
	private static final ProgramFileManager pfm = ProgramFileManager.getInstance();
	private String programFile0Contents;
	
	public void translate(File fileToTranslate, String languageToTranslateTo)
	{
		ProgramFile [] files = null;
		
		try
		{
			files = pfm.getTranslatingFiles(fileToTranslate, languageToTranslateTo);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		programFile0Contents = getContentsOfProgramFile(files[0]);
	}
	
	private String getContentsOfProgramFile(ProgramFile file)
	{
		String result = null;
		
		
		
		return result;
	}
}
