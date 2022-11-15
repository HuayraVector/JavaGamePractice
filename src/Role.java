
public class Role {

	private String name;
	private int life;
	private int magic;
	
	public Role(String name,int life,int magic)
	{
		this.name = name;
		this.life = life;
		this.magic = magic;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setLife(int life)
	{
	this.life = life;	
	}
	public int getLife ()
	{
		return life;
	}
	public void setMagic(int magic)
	{
		this.magic = magic ;
	}
	public int getMagic()
	{
		return magic;
	}
	public void drink(Drug D)
	{
		if(D instanceof RedDrug)
		{
			setLife(getLife() + ((RedDrug)D).getAddLife());
			System.out.println(this.getName()+ "drink" + D.getSize() + "reddrug , HP + " + ((RedDrug)D).getAddLife());
			
		}
		if(D instanceof BlueDrug)
		{
			setLife(getLife() + ((BlueDrug)D).getAddMagic());
			System.out.println(this.getName()+ "drink" + D.getSize() + "bluedrug , HP + " + ((BlueDrug)D).getAddMagic());
			
		}
		
		
		
		
		
	}
	
	
	
	
}
