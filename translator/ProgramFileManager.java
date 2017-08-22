package translator;

public class ProgramFileManager 
{
	private static ProgramFileManager instance = null;
	
	private ProgramFileManager(){}
	
	public static ProgramFileManager getInstance()
	{
		if(instance == null)
			return new ProgramFileManager();
		
		return instance;
	}
	
	
}
