package translator;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import language.*;

public class ProgramFileTest {

	@Test
	public void GetLanguageJavaFile() 
	{
		ProgramFile getLanguageExample = new ProgramFile(new File("/Babel/Examples/exampleJavaProgramFile.java"));
		assertEquals(true, getLanguageExample.getLanguage() instanceof Java);
	}

	@Test
	public void GetLanguagePythonFile() 
	{
		ProgramFile getLanguageExample = new ProgramFile(new File("/Babel/Examples/examplePythonProgramFile.py"));
		assertEquals(true, getLanguageExample.getLanguage() instanceof Python);
	}
}
