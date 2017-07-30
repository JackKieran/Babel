package BabelMainPackage;

public class Translator 
{	
	
	private static final ProgramFileManager pfm = ProgramFileManager.getInstance();
	
	public static void translate(String fileToTranslate, String languageToTranslateTo)
	{
		ProgramFile [] files = pfm.getTranslatingFiles(fileToTranslate, languageToTranslateTo);
	}
}
