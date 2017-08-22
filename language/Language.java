package language;

public class Language 
{
	public String getExtension()
	{
		return ".extension";
	}
	
	public String getLanguage()
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
	
	public static Language getLanguageFromName(String name)
	{
		Language result = null;
		String testValue = name.toLowerCase();
		
		switch(testValue)
		{
			case "java": result = new Java(); break;
			
			case "python": result = new Python(); break; 
		}
		
		return result;
	}
}
