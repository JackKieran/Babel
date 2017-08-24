package translator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import language.*;

public class ProgramFileTest 
{
	@Test
	public void ConstructorThrowsIOException()
	{
		try
		{
			ProgramFile program = new ProgramFile(new File(""));
			fail("Constructor should have thrown IOException");
		}
		
		catch(FileNotFoundException fNF)
		{
			fail("Constructor should not have thrown a FileNotFoundException");
		}
		
		catch(IOException io)
		{
			assertTrue(true);
		}
	}
	
	@Test
	public void GetLanguageJavaFile() 
	{
		try
		{
			ProgramFile getLanguageExample = new ProgramFile(new File("exampleJavaProgramFile.java"));
			assertEquals(true, getLanguageExample.getLanguage() instanceof Java);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			fail("An Exception should not have been thrown");
		}
	}

	@Test
	public void GetLanguagePythonFile() 
	{
		try
		{
			ProgramFile getLanguageExample = new ProgramFile(new File("examplePythonProgramFile.py"));
			assertEquals(true, getLanguageExample.getLanguage() instanceof Python);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			fail("An Exception should not have been thrown");
		}
	}
}
