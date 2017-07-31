package BabelMainPackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProgramFileManager 
{
	public static ProgramFileManager instance = null;
	
	private ProgramFileManager()
	{
		
	}
	
	public static ProgramFileManager getInstance()
	{
		if(instance == null)
			return new ProgramFileManager();
		
		return instance;
	}
	
	protected ProgramFile[] getTranslatingFiles(String fileToTranslate, String languageToTranslateTo)
	{
		ProgramFile translateSource = ProgramFile.newFile(fileToTranslate);
		
		Method getExtension = null;
		try 
		{
			getExtension = Class.forName(fileToTranslate).getMethod("getExtension");
		} 
		catch (NoSuchMethodException | SecurityException | ClassNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		
		String translatedFilepath = null;
		try 
		{
			translatedFilepath = fileToTranslate.substring(0,fileToTranslate.lastIndexOf('.')) + (String)getExtension.invoke(new Python());
		} 
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) 
		{
			e.printStackTrace();
		}
		
		ProgramFile translateDestination = ProgramFile.newFile(translatedFilepath);
		
		ProgramFile [] result = {translateSource, translateDestination};
		return result;
	}
}
