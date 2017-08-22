package translator;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import language.*;

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
			
			fail("Method: getTranslatingFiles should have thrown a FileIsTheSameLanguage exception");
		}
		
		catch(Exception e)
		{
			assertEquals("The file: translatingFilesThrowException.java is already a Java file", e.getMessage());
		}
	}
	
	@Test
	public void GetTranslatingFilesJavaToPython()
	{
		try
		{
			File fileToTranslate = new File("/Babel/Examples/translatingFilesExamples/translatingFilesThrowException.java");
			ProgramFile [] files = pfm.getTranslatingFiles(fileToTranslate, "Python");
			
			assertEquals(true, files[1].getLanguage() instanceof Python);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			fail("Method: getTranslatingFiles should not have thrown an exception");
		}
	}
	
	
	@Test
	public void sameLanguage()
	{
		assertEquals(true, pfm.sameLanguage(new Java(), "java"));
	}
}
