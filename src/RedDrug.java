
public class RedDrug extends Drug{

	private int AddLife;
	
	public RedDrug()
	{
		if(this.getSize().equals("big"))
		{
			this.AddLife = 120;
		}
		else if(this.getSize().equals("med"))
		{
			this.AddLife = 80;
		}
		else if(this.getSize().equals("small"))
		{
			this.AddLife = 50;
		}
		else
		{
		this.AddLife = 0;	
		}
		
		
		
	}
	public int getAddLife()
	{
		return AddLife;
	}
	
}
