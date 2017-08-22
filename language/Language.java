package language;

public class Language 
{
	public static String getExtension()
	{
		return ".extension";
	}
	
	public static String getLanguage()
	{
		return "language";
	}
	
	public static Language getLanguageFromExtension(String extension)
	{
		Language result = null;
		
		switch(extension) 
		{
			case ".java": result = new Java(); break;
			
			case ".py": result = new Python(); break;
		}
		
		return result;
	}
}
