class Witch extends Role implements MagicRecoverable{

	Witch(String name,int life,int magic)
	{
		super(name,life,magic);
	}
	
	public void SmallFire(Role R)
	{
		if(R.getMagic() <= 0)
		{
			System.out.println("�]�O�����A�����L��!!");
		}
		else
		{
			this.setMagic(this.getMagic()-25);
			
			if(R instanceof Warrior)
			{
				R.setLife(R.getLife()-40);
			}
			else
			{
				R.setLife(R.getLife()-60);
			}
			if(R.getLife() <=0)
			{
				System.out.println(R.getName() + "�Q" + this.getName() + "�����F!!");
				System.exit(0);
			}
			
		}
		
		
	}
	public int recoverMagic()
	{
		return MAGICRATE;
	}
	
}
