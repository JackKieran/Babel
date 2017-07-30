package BabelMainPackage;

public class Python implements Language 
{
	@Override
	public String getExtension()
	{
		return ".py";
	}

	@Override
	public String getLanguage() 
	{
		return "Python";
	}
}
