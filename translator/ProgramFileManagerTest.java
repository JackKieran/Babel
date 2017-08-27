package translator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import language.*;

public class ProgramFileManagerTest 
{
	ProgramFileManager pfm = ProgramFileManager.getInstance();
	
	@Test
	public void GetTranslatingJavaFileThrowsFileIsTheSameLanguageException()
	{
		try
		{
			File fileToTranslate = new File("translatingFilesThrowException.java");
			pfm.getTranslatingFiles(fileToTranslate, "Java");
			fail("getTranslatingFiles should have thrown an exception");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			assertTrue(true);
		}
		
		catch(IOException io)
		{
			fail("getTranslatingFiles should have thrown a FileIsTheSameLanguageException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("getTranslatingFiles should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("getTranslatingFiles should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void GetTranslatingFileThrowsIOException()
	{
		try
		{
			File fileToTranslate = new File("");
			pfm.getTranslatingFiles(fileToTranslate, "Python");
			fail("getTranslatingFiles should have thrown an exception");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("getTranslatingFiles should have thrown an IOException");
		}
		
		catch(IOException io)
		{
			assertTrue(true);
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("getTranslatingFiles should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("getTranslatingFiles should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void GetTranslatingFilesThrowsFileIsNotAProgram()
	{
		try
		{
			File fileToTranslate = new File("exampleNotAProgram.txt");
			pfm.getTranslatingFiles(fileToTranslate, "Python");
			fail("getTranslatingFiles should have thrown an exception");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("getTranslatingFiles should not have thrown a FileIsTheSameLanguagueException");
		}
		
		catch(IOException io)
		{
			fail("getTranslatingFiles should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			assertTrue(true);
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("getTranslatingFiles should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void GetTranslatingFilesThrowsNotAValidLanguage()
	{
		try
		{
			File fileToTranslate = new File("exampleJavaProgramFile.java");
			pfm.getTranslatingFiles(fileToTranslate, "");
			fail("getTranslatingFiles should have thrown an exception");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("getTranslatingFiles should not have thrown a FileIsTheSameLanguagueException");
		}
		
		catch(IOException io)
		{
			fail("getTranslatingFiles should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("getTranslatingFiles should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			assertTrue(true);
		}
	}
	
	@Test
	public void GetTranslatingFilesJavaToPython()
	{
		try
		{
			File fileToTranslate = new File("exampleJavaProgramFile.java");
			ProgramFile [] files = pfm.getTranslatingFiles(fileToTranslate, "Python");
			
			assertTrue(files[0].getLanguage() instanceof Java);
			assertTrue(files[1].getLanguage() instanceof Python);
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("getTranslatingFiles should not have thrown a FileIsTheSameLanguageException");
		}
		
		catch(IOException io)
		{
			fail("getTranslatingFiles should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("getTranslatingFiles should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("getTranslatingFiles should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void GetTranslatingFilesPythonToJava()
	{
		try
		{
			File fileToTranslate = new File("examplePythonProgramFile.py");
			ProgramFile [] files = pfm.getTranslatingFiles(fileToTranslate, "Java");
			
			assertTrue(files[0].getLanguage() instanceof Python);
			assertTrue(files[1].getLanguage() instanceof Java);
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("getTranslatingFiles should not have thrown a FileIsTheSameLanguageException");
		}
		
		catch(IOException io)
		{
			fail("getTranslatingFiles should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("getTranslatingFiles should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("getTranslatingFiles should not have thrown a NotAValidLanguageException");
		}
	}
}
