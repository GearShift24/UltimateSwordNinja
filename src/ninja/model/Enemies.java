package ninja.model;

/**
 * 
 * @author joey wrigley / todd williamson
 * Both assisted in adding the code to making hp and attack work as well with names!
 *
 */

	//startAbstraction
public abstract class Enemies {
	
	private int health;
	private int maxHealth;
	private String name;
	
	
	public Enemies(String name)
	{
		this.name = name;
	}
	
	public int getMaxHealth()
	{
		return maxHealth;
	}
	
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void setMaxHealth(int maxHealth)
	{
		this.maxHealth = maxHealth;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int attack()
	{
		return 0;
	}
}
//endAbstraction