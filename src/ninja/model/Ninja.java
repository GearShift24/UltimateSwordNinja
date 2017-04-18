package ninja.model;


public class Ninja extends Hero
{

	public Ninja()
	{
		super("Your Ninja");
	}
	
	public Ninja(String name)
	{
		super(name);

		this.setPlayerHealth(30);
	}
	
	public int luckyHit()
	{
		int i = (int) Math.random() * 1;
		if(i == 0)
		{
			return (int) (Math.random() * 15) + 1;
		}
		else
		{
		return (int) (Math.random() * 35) + 1;
		}
	}
	
	public int rangeAttack()
{		
	int i = (int) Math.random() * 1;
		
		if( i == 0)
				{
			return 7;
				}
		{
			return 17;
		}
		
	
	}
	
	public int attack()
	{
		return this.getPlayerHealth() / (5/2);
	}
}
