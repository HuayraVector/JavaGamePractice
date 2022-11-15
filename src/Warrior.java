class Warrior extends Role implements LifeRecoverable{

	Warrior(String name,int life,int magic)
	{
		super(name,life,magic); 
	}
	public void NewMoon(Role R)
	{
		if(this.getMagic() < 10)
		{
			System.out.println("魔力不足，攻擊無效!!");
		}
		else
		{
			
			this.setMagic(this.getMagic()-10);
			
			if(R instanceof Warrior)
			{
				R.setLife(R.getLife()-25);
			}
			else
			{
				R.setLife(R.getLife()-40);
			}
			if(R.getLife()<=0)
			{

				System.out.println(R.getName() + "被" + this.getName() + "打死了!!");
				System.exit(0);
			}
		}
		
		
		
	}
	
	public int recoverLife()
	{
		return LIFERATE;
	}
}
