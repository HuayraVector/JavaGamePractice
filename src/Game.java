
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Role R[] = new Role[6];
		R[0] = new Warrior("�ѤU�Ĥ@�M",4000,10000);
		R[1] = new Warrior("�ѤU�ĤG�M", 4000, 10000);
		R[2] = new Warrior("�ѤU�ĤT�M", 4000, 10000);
		R[3] = new Witch("�ѤU�Ĥ@�k", 2800, 20000);
		R[4] = new Witch("�ѤU�ĤG�k", 2800, 20000);
		R[5] = new Witch("�ѤU�ĤT�k", 2800, 20000);
		int a ,b ;
		while(true)
		{
			a = (int)(Math.random()*6);
			b = (int)(Math.random()*6);
			if(a == b)
			{
				b = (int)(Math.random()*6);
			}
			//attack
			System.out.println(R[a].getName()+ "��" + R[b].getName() );
			// a is Warrior
			if(a <3 )
			{
				((Warrior)R[a]).NewMoon(R[b]);
			}
			else
			{
				((Witch)R[a]).SmallFire(R[b]);
			}
			//drink
			if(R[b].getLife()<40)
			{
				RedDrug RD = new RedDrug();
				R[b].drink(RD);
			}
			if(R[a].getMagic() < 40)
			{
				BlueDrug BD = new BlueDrug();
				R[a].drink(BD);
			}
			for(int i = 0; i<3;i++)
			{
				if(R[i].getLife()<4000)
				{
					R[i].setLife(R[i].getLife() + ((Warrior)R[i]).recoverLife());
				}
				
			for(int j =3; j <6 ;j++)
			{
				R[j].setLife(R[j].getMagic() +((Witch)R[j]).recoverMagic());
			}
			}
			
		}
		
	}

}
