package translator;

import java.io.File;

public class Translator 
{	
	private static final ProgramFileManager pfm = ProgramFileManager.getInstance();
	
	public static void translate(File fileToTranslate, String languageToTranslateTo)
	{
		ProgramFile [] files = pfm.getTranslatingFiles(fileToTranslate, languageToTranslateTo);
	}
}
