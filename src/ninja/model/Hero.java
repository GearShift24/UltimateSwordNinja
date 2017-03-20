 package ninja.model;

public abstract class Hero {
	/**
	 * Joe Wrigley
	 * made all inside methods and declarations
	 */
	private int playerHealth;
	private String name;
	
	
	public Hero(String name)
	{
		this.name = name;
	}
	
	
	public int getPlayerHealth()
	{
		return playerHealth;
	}
	public void setPlayerHealth(int playerHealth)
	{
		this.playerHealth = playerHealth;
	}

	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int rangeAttack()
	{
		return 0;
	}
	public int attack()
	{
		return 0;
	}
	
	public int luckyHit()
	{
		return 0;
	}
}


