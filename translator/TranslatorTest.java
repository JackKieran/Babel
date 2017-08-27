package translator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TranslatorTest 
{
	private Translator translator = new Translator();
	
	@Test
	public void translateThrowsIOException() 
	{
		File fileToTranslate = new File("");
		
		try
		{
			translator.translate(fileToTranslate, "Java");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("translate should not have thrown a FileIsTheSameLanguagueException");
		}
		
		catch(IOException io)
		{
			assertTrue(true);
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("translate should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("translate should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void translateThrowsFileIsTheSameLanguageException()
	{
		File fileToTranslate = new File("translateExampleJavaProgram.java");
		
		try
		{
			translator.translate(fileToTranslate, "Java");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			assertTrue(true);
		}
		
		catch(IOException io)
		{
			fail("translate should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("translate should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("translate should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void translateThrowsFileIsNotAProgramException()
	{
		File fileToTranslate = new File("translateNotAProgram.txt");
		
		try
		{
			translator.translate(fileToTranslate, "Java");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("translate should not have thrown a FileIsTheSameLanguageException");
		}
		
		catch(IOException io)
		{
			fail("translate should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			assertTrue(true);
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			fail("translate should not have thrown a NotAValidLanguageException");
		}
	}
	
	@Test
	public void translateThrowsNotAValidLanguageException()
	{
		File fileToTranslate = new File("translateExampleJavaProgram.java");
		
		try
		{
			translator.translate(fileToTranslate, "");
		}
		
		catch(FileIsTheSameLanguageException fITSL)
		{
			fail("translate should not have thrown a FileIsTheSameLanguageException");
		}
		
		catch(IOException io)
		{
			fail("translate should not have thrown an IOException");
		}
		
		catch(FileIsNotAProgramException fINAP)
		{
			fail("translate should not have thrown a FileIsNotAProgramException");
		}
		
		catch(NotAValidLanguageException nAVL)
		{
			assertTrue(true);
		}
	}
}
