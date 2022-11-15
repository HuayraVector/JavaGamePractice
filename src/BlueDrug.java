
public class BlueDrug extends Drug{

	private int AddMagic;
	
	public BlueDrug()
	{
		if(this.getSize().equals("big"))
		{
			this.AddMagic = 100;
		}
		else if(this.getSize().equals("med"))
		{
			this.AddMagic = 60;
		}
		else if(this.getSize().equals("small"))
		{
			this.AddMagic = 30;
		}
		else
		{
			this.AddMagic = 0;
		}
	}
	public int getAddMagic()
	{
		return AddMagic;
	}
	
}
