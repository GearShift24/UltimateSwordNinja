package ninja.model;


public class Ninja extends Hero
{
	/**
	 * Joe Wrigley
	 * made all inside methods and declarations
	 */
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
		return (int) (Math.random() * 35) + 1;
	}
	
	public int rangeAttack()
{		
	int i = (int) Math.random() * 2;
		
		if( i == 0)
				{
			return 3;
				}
		else if(i == 1)
		{
			return 10;
		}
		else
		{
			return 18;
		}
		
	
	}
	
	public int attack()
	{
		return this.getPlayerHealth() / (5/2);
	}
}
