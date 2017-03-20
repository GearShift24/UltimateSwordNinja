package ninja.model;

public class Ninja extends Hero {

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
		return 6;
	}
	
	public int attack()
	{
		return this.getPlayerHealth() / (5/2);
	}
}
