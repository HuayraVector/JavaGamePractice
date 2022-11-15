
public class Drug {

	private String size;
	
	public  Drug()
	{
		int a = (int)(Math.random()*6);
		
		if(a == 0)
		{
			this.size = "big";
		}
		else if(a >= 1 && a <= 2)
		{
			this.size = "med";
		}
		else if(a >=3 && a<=6)
		{
			this.size = "small";
		}
		else
		{
			this.size = "no";
		}
		
		
	}
	public String getSize()
	{
		return this.size;
	}
	
}
