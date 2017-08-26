package translator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
		System.out.println(programFile0Contents);
	}
	
	private String getContentsOfProgramFile(ProgramFile file)
	{
		String result = null;
		FileInputStream input = null;
		try
		{
			input = new FileInputStream(file.getFile());
		}
		
		catch(FileNotFoundException fNF)
		{
			fNF.printStackTrace();
		}
		
		try
		{
			int readIn;
			while((readIn = input.read()) != -1)
			{
				result += (char)readIn;
			}
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		return result;
	}
}
