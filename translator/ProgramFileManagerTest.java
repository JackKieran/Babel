package translator;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class ProgramFileManagerTest 
{
	ProgramFileManager pfm = ProgramFileManager.getInstance();
	
	@Test
	public void GetTranslatingFilesThrowException()
	{
		try
		{
			File fileToTranslate = new File("/Babel/Examples/translatingFilesExamples/translatingFilesThrowException.java");
			pfm.getTranslatingFiles(fileToTranslate, "Java");
		}
		
		catch(Exception e)
		{
			assertEquals("The file: translatingFilesThrowException.java is already a Java file", e.getMessage());
		}
	}
}
