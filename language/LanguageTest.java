package language;

import static org.junit.Assert.*;

import org.junit.Test;

public class LanguageTest 
{

	@Test
	public void GetLanguageFromExtensionNull() 
	{
		assertEquals(null, Language.getLanguageFromExtension(""));
	}
	
	@Test
	public void GetLanguageFromExtensionJava()
	{
		assertEquals(true, Language.getLanguageFromExtension(".java") instanceof Java);
	}

	@Test
	public void GetLanguageFromExtensionPython()
	{
		assertEquals(true, Language.getLanguageFromExtension(".py") instanceof Python);
	}
	
	@Test
	public void GetLanguageFromNameNull()
	{
		assertEquals(null, Language.getLanguageFromName(""));
	}
	
	@Test
	public void GetLanguageFromNameJava()
	{
		assertEquals(true, Language.getLanguageFromName("java") instanceof Java);
	}
	
	@Test
	public void GetLanguageFromNamePython()
	{
		assertEquals(true, Language.getLanguageFromName("python") instanceof Python);
	}
}
